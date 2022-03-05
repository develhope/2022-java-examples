package co.develhope.diDemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${spring.helloMessage}")
    private String helloMessage;

    HelloService(AnotherHelloService numberOfHello){

    }

    public String getHello(){
        return helloMessage;
    }
}
