package org.example.service;

import org.example.dto.LoginRequest;
import org.example.dto.UserDto;
import org.example.entity.UserEntity;

public interface UserService {
    UserEntity addUser(UserDto user);

    String login(LoginRequest loginRequest);
}
