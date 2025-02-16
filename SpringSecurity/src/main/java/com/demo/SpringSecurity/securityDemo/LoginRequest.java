package com.demo.SpringSecurity.securityDemo;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
