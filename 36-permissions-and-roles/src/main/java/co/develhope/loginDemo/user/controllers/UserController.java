package co.develhope.loginDemo.user.controllers;

import co.develhope.loginDemo.auth.entities.LoginRTO;
import co.develhope.loginDemo.auth.services.LoginService;
import co.develhope.loginDemo.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
@RestController
public class UserController {

    @Autowired
    LoginService loginService;

    @GetMapping("/profile")
    public LoginRTO getProfile(Principal principal ){
        User user = (User) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();
        LoginRTO rto = new LoginRTO();
        rto.setUser(user);
        rto.setJWT(loginService.generateJWT(user));
        return rto;

    }
}
