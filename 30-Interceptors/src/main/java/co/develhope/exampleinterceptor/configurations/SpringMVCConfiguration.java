package co.develhope.exampleinterceptor.configurations;

import co.develhope.exampleinterceptor.interceptors.APILoggingInterceptor;
import co.develhope.exampleinterceptor.interceptors.LoggedUserInterceptor;
import co.develhope.exampleinterceptor.interceptors.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private TestInterceptor testInterceptor;

    @Autowired
    private LoggedUserInterceptor loggedUserInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(testInterceptor);
        registry.addInterceptor(loggedUserInterceptor);
    }
}
