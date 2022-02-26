package co.develhope.spingBootStrart.controllers;

import co.develhope.spingBootStrart.services.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping("/")
    public String sayHello(){
        return helloWordService.sayHelloWord();
    }
}
