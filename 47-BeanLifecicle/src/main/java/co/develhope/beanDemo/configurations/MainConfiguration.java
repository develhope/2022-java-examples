package co.develhope.beanDemo.configurations;

import co.develhope.beanDemo.services.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean(name = "MyService",initMethod = "onInit", destroyMethod = "onDestroy")
    public MyService getService(){
        System.out.println("[getService][MyService]");
        return new MyService();
    }
}
