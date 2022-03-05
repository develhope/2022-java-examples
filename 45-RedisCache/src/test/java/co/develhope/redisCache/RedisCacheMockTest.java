package co.develhope.redisCache;

import co.develhope.redisCache.entities.User;
import co.develhope.redisCache.entities.redis.UserRedis;
import co.develhope.redisCache.repositories.redis.UserRepositoryRedis;
import co.develhope.redisCache.services.UserService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisCacheMock.class)
public class RedisCacheMockTest {

    @Autowired
    private UserRepositoryRedis userRepositoryRedis;

    @Autowired
    private UserService userService;

    @Test
    public void souldWriteOnRedisCache(){
        UserRedis userRedis = new UserRedis();
        userRedis.setDomicileCity("Milano");
        userRedis.setId(1L);
        userRedis.setEmail("email@email.com");
        userRedis.setFirstName("MuName");

        UserRedis userSavedInRedisCache = userRepositoryRedis.save(userRedis);

        Assertions.assertNotNull(userSavedInRedisCache);
    }

    @Test
    public void shouldCreateUser(){
        //userService.create()
    }

    @Test
    public void shouldGetUserFromCache(){
        //userService.readOne()
    }

    @Test
    public void shouldDeleteUser(){
        //userService.delete();
    }

    @Test
    public void shouldUpdateUser(){
        //userService.update();
    }
}
