package com.thinkflare.thinkflare.controllers;

import com.thinkflare.thinkflare.dto.EnrolmentDto;
import com.thinkflare.thinkflare.entities.Enrolment;
import com.thinkflare.thinkflare.mappers.EnrolmentMapper;
import com.thinkflare.thinkflare.services.EnrolmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrolment")
public class EnrolmentController {

    private final EnrolmentService enrolmentService;
    private final EnrolmentMapper enrolmentMapper;

    @Autowired
    public EnrolmentController(EnrolmentService enrolmentService, EnrolmentMapper enrolmentMapper) {
        this.enrolmentService = enrolmentService;
        this.enrolmentMapper = enrolmentMapper;
    }

    @PostMapping("/add-enrolment")
    public ResponseEntity<?> addEnrolment(@RequestBody EnrolmentDto enrolmentDto){
        Enrolment enrolment = this.enrolmentMapper.mapToModel(enrolmentDto);
        return new ResponseEntity<>(this.enrolmentService.addEnrolment(enrolment), HttpStatus.CREATED);
    }

}
