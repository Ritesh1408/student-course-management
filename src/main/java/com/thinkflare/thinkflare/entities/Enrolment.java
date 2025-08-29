package com.thinkflare.thinkflare.entities;

import com.thinkflare.thinkflare.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrolment")
@Getter
@Setter
public class Enrolment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses courses;

    @Column(name = "enrolment_date", nullable = false)
    private LocalDateTime enrolmentDate;

    @Column(name = "course_status", nullable = false)
    private CourseStatus status = CourseStatus.ACTIVE;
}
