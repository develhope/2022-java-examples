package co.develhope.crudTestDemo.controllers;

import co.develhope.crudTestDemo.entities.User;
import co.develhope.crudTestDemo.repositories.UserRepository;
import co.develhope.crudTestDemo.service.UserService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("")
    public @ResponseBody User create(@RequestBody  User user){
        return userRepository.save(user);
    }

    @GetMapping("/")
    public @ResponseBody  List<User> getList(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody  User getSingle(@PathVariable long id){
        Optional<User> user =  userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            return null;
        }
    }

    @PutMapping("/{id}")
    public @ResponseBody User update(@PathVariable long id, @RequestBody  @NotNull User user){
        user.setId(id);
        return userRepository.save(user);
    }

    @PutMapping("/{id}/activation")
    public @ResponseBody User setUserActive(@PathVariable long id, @RequestParam("activated") boolean activated){
        return userService.setUserActivationStatus(id, activated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        userRepository.deleteById(id);
    }


}
