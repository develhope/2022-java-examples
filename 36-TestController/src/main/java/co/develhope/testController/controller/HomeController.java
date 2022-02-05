package co.develhope.testController.controller;

import co.develhope.testController.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public @ResponseBody String helloWord(){
        return "Hello World";
    }

    @GetMapping("/user")
    public @ResponseBody User getUser(){
        return new User("Lorenzo", "De Francesco");
    }
}
