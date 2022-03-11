package co.develhope.customQueries.controllers;

import co.develhope.customQueries.entities.User;
import co.develhope.customQueries.entities.UserStatus;
import co.develhope.customQueries.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/provisioning")
    public void provisionUsers(){
        List<User> users = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            User user = new User();
            user.setFirstName("Lorenzo");
            user.setLastName("De Francesco");
            user.setEmail(UUID.randomUUID().toString() +"@develhope.co");
            user.setStatus(UserStatus.BANNED);
            user.setBirthDate(LocalDateTime.now());

            users.add(user);
        }

        for(int i = 0; i< 10; i++){
            User user = new User();
            user.setFirstName("Anna");
            user.setLastName("Rossi");
            user.setEmail(UUID.randomUUID().toString() +"@develhope.co");
            user.setStatus(UserStatus.DEACTIVATED);
            user.setBirthDate(LocalDateTime.now());

            users.add(user);
        }

        for(int i = 0; i< 10; i++){
            User user = new User();
            user.setFirstName("Gianni");
            user.setLastName("Verdi");
            user.setEmail(UUID.randomUUID().toString() +"@develhope.co");
            user.setStatus(UserStatus.ACTIVE);
            user.setBirthDate(LocalDateTime.now());

            users.add(user);
        }
        userRepository.saveAll(users);
    }

    //https://www.baeldung.com/spring-data-jpa-pagination-sorting
    @GetMapping
    public Page<User> getAllUsers(@RequestParam int page, @RequestParam int size){
        return userRepository.findAll(PageRequest.of(page, size, Sort.by("status").ascending().and(Sort.by("email").descending())));
    }

    @GetMapping("/status/{status}")
    public Page<User> getAllUsers(@PathVariable UserStatus status, @RequestParam int page, @RequestParam int size){
        return userRepository.findAllByStatus(status, PageRequest.of(page, size));
    }

    @GetMapping("/custom")
    public Page<User> getCustomUser(@RequestParam UserStatus status, @RequestParam String email, @RequestParam Optional<Integer> page, @RequestParam Optional<Integer> size){
        if(page.isPresent()){
            return userRepository.getCustomUserSmart(status, email, PageRequest.of(page.get(), size.orElse(20)));
        }else {
            List<User> users = userRepository.getCustomUserSmart(status, email);
            return new PageImpl<User>(users);

        }
    }

    @PostMapping("/status/{status}")
    public void UpdateStatusForAllUsers(@PathVariable UserStatus status){
        userRepository.setAllUsersStatus(status.ordinal());
    }
}
