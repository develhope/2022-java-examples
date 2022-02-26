package co.develhope.mongoDbDemo.repositories;

import co.develhope.mongoDbDemo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
