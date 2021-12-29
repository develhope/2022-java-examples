package it.develhope.apiStart.controller;

import it.develhope.apiStart.DTO.UserDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class EchoController {

    @GetMapping(value = "/echo/{id}")
    public String getRoute(@PathVariable String id, @RequestParam(required = false)  Integer quantity, @RequestHeader HttpHeaders headers){
        return "Ciao io sono il get " + id + " quantiy is: " + quantity;
    }

    @PostMapping(value = "/echo")
    public String postRoute(@Valid @RequestBody(required = false) UserDTO user, HttpServletRequest request, HttpServletResponse response){
        return user.toString();
    }

    @DeleteMapping(value = "/echo")
    public String deleteRoute(){
        return "Ciao io sono il DELETE";
    }
}
