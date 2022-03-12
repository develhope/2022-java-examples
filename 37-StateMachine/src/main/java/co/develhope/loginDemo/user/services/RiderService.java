package co.develhope.loginDemo.user.services;

import co.develhope.loginDemo.user.entities.User;
import co.develhope.loginDemo.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RiderService {

    @Autowired
    private UserRepository userRepository;

    public User pickRider(){
        Optional<User> rider = userRepository.pickRider();
        if(rider.isPresent()){
            // There is a free rider
            return rider.get();
        }else{
            // All riders are busy -> Take the first available
            return userRepository.findAll(PageRequest.of(0, 1)).toList().get(0);
        }
    }
}
