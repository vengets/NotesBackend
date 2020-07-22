package com.example.notes.model;

public class User {
    String id;
    String passwordHash;

    public User(String id, String passwordHash) {
        this.id = id;
        this.passwordHash = passwordHash;
    }

    public String getId() {
        return id;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
