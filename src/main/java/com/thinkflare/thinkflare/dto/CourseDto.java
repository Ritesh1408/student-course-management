package com.thinkflare.thinkflare.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CourseDto {

    private String name;

    @Min(0)
    private double price;

    @Min(10)
    private int capacity;

    @Min(7)
    @Max(60)
    private int noOfDays;

    private LocalDateTime startDate;

    private String description;

    private long mentorId;

    private LocalDateTime enrolmentEndDate;
}
