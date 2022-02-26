package co.develhope.loginDemo.auth.entities;

import co.develhope.loginDemo.user.entities.User;
import lombok.Data;

@Data
public class LoginRTO {

    private User user;
    private String JWT;
}
