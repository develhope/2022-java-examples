package co.develhope.diDemo.controllers;

import co.develhope.diDemo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //it is a component
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public String get(){
        return helloService.getHello();
    }

    @GetMapping("/pippo")
    public String getPippo(){
        return "Ciao io sono pippo";
    }
}
