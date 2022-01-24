package co.develhope.notification.users.services;

import co.develhope.notification.users.entities.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    static List<User> users = Arrays.asList(
            new User("1", "Lorenzo", "De Francesco", "lory1990@gmail.com"),
            new User("2", "Mario", "Rossi", "lory1991@develhope.co"),
            new User("3", "Giulio", "Verdi", "lory1992@develhope.co"),
            new User("4", "Giovanna", "Giallo", "giovanna@develhope.co")
    );

    public User getUserById(String userId) {
        Optional<User> userFromDB = users.stream().filter(user -> user.getId().equals(userId)).findAny();
        if(userFromDB.isPresent()) return userFromDB.get();
        return null;
    }
}
