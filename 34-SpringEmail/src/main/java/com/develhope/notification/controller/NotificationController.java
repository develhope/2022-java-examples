package com.develhope.email.notification.controller;

import com.develhope.email.notification.service.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private EmailNotificationService emailNotificationService;

    @GetMapping("/mail")
    public ResponseEntity sendMail(){
        emailNotificationService.sendMail(
                "lory1990@gmail.com",
                null,
                "Test mail",
                "This is the text"
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request");
    }
}
