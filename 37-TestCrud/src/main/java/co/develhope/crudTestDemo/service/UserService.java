package co.develhope.crudTestDemo.service;

import co.develhope.crudTestDemo.entities.User;
import co.develhope.crudTestDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User setUserActivationStatus(Long userId, boolean isActive){
        Optional<User> user = userRepository.findById(userId);
        if(!user.isPresent()) return null;
        user.get().setActive(isActive);
        return userRepository.save(user.get());
    }
}
