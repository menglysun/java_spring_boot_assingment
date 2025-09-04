package com.mengly_dev.java_spring_boot_assingment.auth.controller;

import com.mengly_dev.java_spring_boot_assingment.auth.dto.AuthResponse;
import com.mengly_dev.java_spring_boot_assingment.auth.dto.LoginRequest;
import com.mengly_dev.java_spring_boot_assingment.auth.dto.RegisterRequest;
import com.mengly_dev.java_spring_boot_assingment.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) { try {
        AuthResponse response = authService.login(loginRequest);
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        return ResponseEntity.badRequest().build();
    }
    }
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) { try {
        AuthResponse response = authService.register(registerRequest);
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        return ResponseEntity.badRequest().build();
    }
    }
}

