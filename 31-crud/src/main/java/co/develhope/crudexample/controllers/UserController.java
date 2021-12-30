package co.develhope.crudexample.controllers;

import co.develhope.crudexample.entities.User;
import co.develhope.crudexample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user){
        user.setId(null);
        User userSaved = userRepository.saveAndFlush(user);
        return userSaved;
    }

    @GetMapping
    public Page<User> get(@RequestParam(required = false) Optional<Integer> page, @RequestParam(required = false) Optional<Integer> size){
        if(page.isPresent() && size.isPresent()) {
            Sort sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "lastName"), new Sort.Order(Sort.Direction.DESC, "firstName"));
            Pageable pageable = PageRequest.of(page.get(), size.get(), sort);
            Page<User> users = userRepository.findAll(pageable);
            return users;
        }else{
            Page<User> pageUser = Page.empty();
            return pageUser;
        }
    }

    @GetMapping("/{id}")
    public User getSingle(@PathVariable long id){
        User user = userRepository.getById(id);
        return user;
    }

    @PutMapping("/{id}")
    public User updateSingle(@PathVariable long id, @RequestBody User user){
        user.setId(id);
        User newUser = userRepository.saveAndFlush(user);
        return newUser;
    }

    @DeleteMapping("/{id}")
    public void deleteSingle(@PathVariable long id){
        userRepository.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteMultiple(@RequestParam List<Long> ids){
        userRepository.deleteAllById(ids);
    }


}
