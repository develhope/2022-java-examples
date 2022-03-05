package co.develhope.fileUploader.repositories;

import co.develhope.fileUploader.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
