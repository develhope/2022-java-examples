package co.develhope.notification.api.controller;

import co.develhope.notification.email.services.EmailService;
import co.develhope.notification.api.entities.NotificationDTO;
import co.develhope.notification.users.entities.User;
import co.develhope.notification.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class NotificationController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/notification")
    public ResponseEntity sendNotification(@RequestBody NotificationDTO payload){
        try {
            User userToSendNotification = userService.getUserById(payload.getUserId());
            System.out.println("Getting the user: " + userToSendNotification);
            if (userToSendNotification == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Did not find the user");
            }
            emailService.sendTo(userToSendNotification.getEmail(), payload.getTitle(), payload.getText());
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            System.err.println("Error in notification controller: " + e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
