package com.example.mergiterog.service;

import com.example.mergiterog.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
