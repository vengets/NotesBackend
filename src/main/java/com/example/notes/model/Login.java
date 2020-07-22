package com.example.notes.model;

public class Login {
    String token;
    String status;

    public Login(String token, String status) {
        this.token = token;
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public String getStatus() {
        return status;
    }
}
