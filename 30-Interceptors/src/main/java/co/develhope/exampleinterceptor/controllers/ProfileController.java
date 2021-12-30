package co.develhope.exampleinterceptor.controllers;

import co.develhope.exampleinterceptor.entities.User;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("")
    public User get(HttpServletRequest request){
        User user = (User) request.getAttribute("LoggedUserInterceptor-user");
        return user;
    }
}
