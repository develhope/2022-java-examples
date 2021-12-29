package co.develhope.swaggerexample.controllers;

import co.develhope.swaggerexample.entities.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "")
    @ApiOperation(value = "Says hello", notes = "Prints out the hello message for the user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bada input data"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class),
            @ApiResponse(code = 202, message = "Created")
    })
    public String sayHello(){
        return "Hello my dear";
    }

    @GetMapping(value = "/user")
    public User sayHelloToUser(){
        return new User("Lorenzo", "De Francesco", "Milano", "Pordenone");
    }

    @PostMapping(value = "/user")
    public void createsAUser(@ApiParam(value = "The user request body") @RequestBody(required = false)  User user){

    }

    @GetMapping(value = "/name")
    public String sayHelloWithName(@ApiParam(value = "The name of the user") @RequestParam(required = true) String name){
        return "Hello " + name;
    }

    @GetMapping(value = "/name/{id}")
    public String sayHelloWithNamePath(@ApiParam(value = "The id of the user") @PathVariable() String id){
        return "Hello " + id;
    }
}
