package org.example.fitnessjava.controller;

import jakarta.annotation.Resource;
import org.example.fitnessjava.dao.UserProfileRepository;
import org.example.fitnessjava.pojo.penddingEntity.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping
    public String get(){
        return "hello world";
    }
}
