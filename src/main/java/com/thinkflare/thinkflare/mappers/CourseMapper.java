package com.thinkflare.thinkflare.mappers;

import com.thinkflare.thinkflare.dto.CourseDto;
import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.entities.Mentor;
import com.thinkflare.thinkflare.exceptions.NotFoundException;
import com.thinkflare.thinkflare.repository.MentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    // to convert CourseDto to course

    private final MentoRepository mentoRepository;

    @Autowired
    public CourseMapper(MentoRepository mentoRepository) {
        this.mentoRepository = mentoRepository;
    }

    public Courses mapToModel(CourseDto dto){
        Courses courses = new Courses();
        Mentor mentor = this.mentoRepository.findById(dto.getMentorId())
                .orElseThrow(() -> new NotFoundException("Cannot find mentor with ID: " + dto.getMentorId()));

        courses.setName(dto.getName());
        courses.setPrice(dto.getPrice());
        courses.setCapacity(dto.getCapacity());
        courses.setNoOfDays(dto.getNoOfDays());
        courses.setStartDate(dto.getStartDate());
        courses.setDescription(dto.getDescription());
        courses.setMentor(mentor);
        courses.setEnrolmentEndDate(dto.getEnrolmentEndDate());
        return courses;


    }
}
