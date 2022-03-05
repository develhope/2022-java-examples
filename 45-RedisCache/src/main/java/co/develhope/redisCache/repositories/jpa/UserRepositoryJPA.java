package co.develhope.redisCache.repositories.jpa;

import co.develhope.redisCache.entities.jpa.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends JpaRepository<UserJPA, Long> {
}
