package com.thinkflare.thinkflare.dto;


import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.entities.Student;
import com.thinkflare.thinkflare.enums.CourseStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class EnrolmentDto {

    private long studentId;

    private long coursesId;

    private LocalDateTime enrolmentDate;

    private CourseStatus status = CourseStatus.ACTIVE;
}
