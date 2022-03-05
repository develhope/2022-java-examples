package co.develhope.corsExample.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = {"http://localhost:5500"})
public class HelloController {


    @GetMapping
    public String getHello(){
        return "Hello from backend";
    }

    @GetMapping("/hello")
    public String getHelloBis(){
        return "Hello from backend BIS";
    }
}
