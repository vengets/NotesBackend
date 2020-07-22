package com.example.notes.service;

import com.example.notes.model.Login;
import com.example.notes.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public Login login(User user) {
        if(user.getId().equals("user1") || user.getId().equals("user2")) {
            return new Login(
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ1c2VyMSIsIm5hbWUiOiJ1c2VyMSIsImlhdCI6MTUxNjIzOTAyMn0.8LX-Ti-KyYJ3A4m22Nt7vYUGMrh4ymjJQ8THMSytBc8",
                    "success");
        }
        return new Login("", "failed");
    }
}
