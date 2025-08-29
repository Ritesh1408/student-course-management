package com.thinkflare.thinkflare.services;

import com.thinkflare.thinkflare.entities.Enrolment;
import com.thinkflare.thinkflare.repository.EnrolmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrolmentService {

    public final EnrolmentRepository enrolmentRepository;

    @Autowired
    public EnrolmentService(EnrolmentRepository enrolmentRepository) {
        this.enrolmentRepository = enrolmentRepository;
    }

    public Enrolment addEnrolment(Enrolment enrolment){

        if(enrolment.getEnrolmentDate().isAfter(enrolment.getCourses().getStartDate())){
            // throw some exception
        }

        if(this.enrolmentRepository.findByCourse(enrolment.getCourses()).size() >= enrolment.getCourses().getCapacity() + 1){
            // throw an exception
        }
        if(this.enrolmentRepository.countByCourse(enrolment.getCourses()) + 1 >= enrolment.getCourses().getCapacity()){
            // throw an exception
        }

        return this.enrolmentRepository.save(enrolment);
    }
}
