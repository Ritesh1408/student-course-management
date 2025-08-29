package com.thinkflare.thinkflare.services;

import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Courses addCourse(Courses courses){
        return this.courseRepository.save(courses);
    }

    public Courses getCourseById(long courseId){
        return this.courseRepository.findById(courseId).orElse(null);
    }
}
