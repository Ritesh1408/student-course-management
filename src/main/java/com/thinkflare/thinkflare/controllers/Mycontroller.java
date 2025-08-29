package com.thinkflare.thinkflare.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/add-two-num")
    public int addTwoNumbers(@RequestParam int a, @RequestParam int b){
        return a + b;
    }@GetMapping("/mul-two-num")
    public int mulTwoNumbers(@RequestParam int a, @RequestParam int b){
        return a * b;
    }@GetMapping("/mod-two-num")
    public int modTwoNumbers(@RequestParam int a, @RequestParam int b){
        return a % b;
    }

}
