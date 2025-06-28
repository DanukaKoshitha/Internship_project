package org.example.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.LoginRequest;
import org.example.dto.UserDto;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.example.springSecurity.Jwt;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final Jwt jwtUtil;

    @Override
    public UserEntity addUser(UserDto user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public String login(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword()));

        return jwtUtil.generateToken(authentication.getName());
    }
}
