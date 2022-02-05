package co.develhope.envVars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @Value("${myCustomVarTree.customVar}")
    int myCustomVar;

    @GetMapping("/")
    public String mainEndpoint(){
        String var = environment.getProperty("myCustomVarTree.customVar");
        return var;
    }

    @GetMapping("/other-injection")
    public int mainEndpointII(){
        return myCustomVar;
    }
}
