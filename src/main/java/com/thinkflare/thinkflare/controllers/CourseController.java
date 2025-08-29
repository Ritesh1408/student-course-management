package com.thinkflare.thinkflare.controllers;

import com.thinkflare.thinkflare.dto.CourseDto;
import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.mappers.CourseMapper;
import com.thinkflare.thinkflare.services.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;
    private final CourseMapper courseMapper;

    @Autowired
    public CourseController(CourseService courseService, CourseMapper courseMapper) {
        this.courseService = courseService;
        this.courseMapper = courseMapper;
    }

    @PostMapping("/add-course")
    public ResponseEntity<?> addCourse(@RequestBody @Valid CourseDto courseDto){
        Courses courses = this.courseMapper.mapToModel(courseDto);
        return new ResponseEntity<>(this.courseService.addCourse(courses), HttpStatus.CREATED);
    }
}
