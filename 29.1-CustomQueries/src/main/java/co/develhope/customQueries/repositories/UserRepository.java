package co.develhope.customQueries.repositories;

import co.develhope.customQueries.entities.User;
import co.develhope.customQueries.entities.UserStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findAllByStatus(UserStatus status, Pageable pageable);

    @Query(value = "SELECT u FROM User u WHERE u.status = ?1 AND u.email=?2")
    List<User> getCustomUser(UserStatus userStatus, String email);

    @Query(value = "SELECT u FROM User u WHERE u.status = :status AND u.email=:email")
    List<User> getCustomUserSmart(@Param("status") UserStatus userStatus, @Param("email") String email);

    @Query(value = "SELECT u FROM User u WHERE u.status = :status AND u.email=:email")
    Page<User> getCustomUserSmart(@Param("status") UserStatus userStatus, @Param("email") String email, Pageable page);

    @Query(value = "SELECT * FROM user WHERE id=134", nativeQuery = true)
    Page<User> getCustomUserSmartNative(@Param("status") UserStatus userStatus, @Param("email") String email, Pageable page);

    @Modifying
    @Transactional
    @Query(value = "UPDATE user SET status = :userStatus", nativeQuery = true)
    void setAllUsersStatus(@Param("userStatus") int userStatus);
}
