package co.develhope.loggingTest.controllers;

import co.develhope.loggingTest.services.GreetingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    GreetingsService greetingService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/debug")
    public void debug(){
        logger.debug("This is a DEBUG logging");
    }

    @GetMapping("/greetings")
    public String greetings(){
        logger.info("Starting greeting in controller");
        return greetingService.doGreeting(3);
    }

    @GetMapping("/info")
    public void info(){
        logger.info("This is a INFO logging");
    }

    @GetMapping("/warning")
    public void warning(){
        logger.warn("This is a WARNING logging");
    }

    @GetMapping("/errors")
    public void error(){
        Error error = new Error("This is the error");
        logger.error("This is the ERROR logging", error);
    }
}
