package co.develhope.loginDemo.auth.controller;

import co.develhope.loginDemo.auth.entities.SignupActivationDTO;
import co.develhope.loginDemo.auth.entities.SignupDTO;
import co.develhope.loginDemo.auth.services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class SignupController {

    @Autowired
    private SignupService signupService;

    @PostMapping("/signup")
    public void signup(@RequestBody SignupDTO signupDTO) throws Exception {
        signupService.signup(signupDTO);
    }

    @PostMapping("/signup/activation")
    public void signup(@RequestBody SignupActivationDTO signupActivationDTO) throws Exception {
        signupService.activate(signupActivationDTO);
    }
}
