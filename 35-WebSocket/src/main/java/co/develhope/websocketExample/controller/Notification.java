package co.develhope.websocketExample.controller;

import co.develhope.websocketExample.entities.MessageFromClientDTO;
import co.develhope.websocketExample.entities.SimpleMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Notification {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/notification")
    public ResponseEntity sendNotificationToClients(@RequestBody SimpleMessageDTO message){
        simpMessagingTemplate.convertAndSend("/topic/messages", message);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @MessageMapping("/hello") // /app/hello
    @SendTo("/topic/messages")
    public SimpleMessageDTO handleMessageFromWebSocket(MessageFromClientDTO message){
        System.out.println("Arrived someting on /app/hello - " + message.toString());
        return new SimpleMessageDTO("Message from " + message.getFrom() + " - " + message.getText());
    }

}
