package com.thinkflare.thinkflare.controllers;

import com.thinkflare.thinkflare.entities.Mentor;
import com.thinkflare.thinkflare.services.MentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/mentor")
public class MentorController {

    private final MentoService mentoService;

    @Autowired
    public MentorController(MentoService mentoService) {
        this.mentoService = mentoService;
    }

    //Add mentor
    @PostMapping("/add-mentor")
    public ResponseEntity<?> addMentor(@RequestBody @Valid Mentor mentor){
        try{
            return new ResponseEntity<>(this.mentoService.addMentor(mentor), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.internalServerError().body(Map.of("error : ", e.getMessage()));
        }
    }


}
