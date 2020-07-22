package com.example.notes.controller;

import com.example.notes.model.Login;
import com.example.notes.model.User;
import com.example.notes.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Login> login(@RequestBody User user) {
        Login result = userService.login(user);

        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
}
