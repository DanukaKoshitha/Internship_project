package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService service;
    private ModelMapper mapper;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return mapper.map(service.addUser(user), User.class);
    }
}
