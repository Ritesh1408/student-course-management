package com.thinkflare.thinkflare.mappers;

import com.thinkflare.thinkflare.dto.EnrolmentDto;
import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.entities.Enrolment;
import com.thinkflare.thinkflare.entities.Student;
import com.thinkflare.thinkflare.exceptions.NotFoundException;
import com.thinkflare.thinkflare.repository.CourseRepository;
import com.thinkflare.thinkflare.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnrolmentMapper {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public EnrolmentMapper(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Enrolment mapToModel(EnrolmentDto dto){
        Student student = this.studentRepository.findById(dto.getStudentId()).
                orElseThrow(() -> new NotFoundException("Student with ID:"+ dto.getStudentId() + "does not exist"));
        Courses courses = this.courseRepository.findById(dto.getCoursesId()).
                orElseThrow(() -> new NotFoundException("Course with ID:"+ dto.getCoursesId() + "does not exist"));
        Enrolment enrolment = new Enrolment();
        enrolment.setCourses(courses);
        enrolment.setStudent(student);
        enrolment.setEnrolmentDate(dto.getEnrolmentDate());
        enrolment.setStatus(dto.getStatus());
        return enrolment;
    }


}
