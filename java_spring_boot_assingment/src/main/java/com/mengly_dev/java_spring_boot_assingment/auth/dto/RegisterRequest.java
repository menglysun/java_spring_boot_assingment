package com.mengly_dev.java_spring_boot_assingment.auth.dto;

public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    // Constructors, getters, and setters
    public RegisterRequest() {}
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
