package org.example.fitnessjava.controller.client;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client/user")
public class UserController {
    @PostMapping
    public void login(@RequestBody final User user) {

    }
}
