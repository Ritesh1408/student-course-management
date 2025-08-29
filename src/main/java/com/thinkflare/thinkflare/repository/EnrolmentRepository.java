package com.thinkflare.thinkflare.repository;

import com.thinkflare.thinkflare.entities.Courses;
import com.thinkflare.thinkflare.entities.Enrolment;
import com.thinkflare.thinkflare.entities.Student;
import com.thinkflare.thinkflare.enums.CourseStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrolmentRepository extends JpaRepository<Enrolment, Long> {

    List<Enrolment> findByCourse(Courses courses);

    long countByCourse(Courses courses);

    List<Enrolment> findByStudent(Student student);

    List<Enrolment> findByStudentAndStatus(Student student, CourseStatus status);
    // write a query that takes studentId as params to find all enrollments for that students.
    // with filter find active enrollment
}
