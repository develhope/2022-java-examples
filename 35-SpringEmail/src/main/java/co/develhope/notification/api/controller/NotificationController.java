package co.develhope.notification.controller;

import co.develhope.notification.email.EmailService;
import co.develhope.notification.entities.NotificationDTO;
import co.develhope.notification.users.entities.User;
import co.develhope.notification.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NotificationController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/notification")
    public void sendNotification(NotificationDTO payload){
        User userToSendNotification = userService.getUserById(payload.getUserId());
        emailService.sendTo(userToSendNotification.getEmail(), payload.getTitle(), payload.getText());
    }
}
