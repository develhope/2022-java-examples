package co.develhope.exampleinterceptor.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: Start Time=" + System.currentTimeMillis());
        request.setAttribute("startTime", startTime);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("Request URL::" + request.getRequestURL().toString() + " Sent to Handler :: Current Time=" + System.currentTimeMillis());
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        System.out.println("Request URL::" + request.getRequestURL().toString()  + ":: End Time=" + System.currentTimeMillis());
        System.out.println("Request URL::" + request.getRequestURL().toString()  + ":: Time Taken=" + (System.currentTimeMillis() - startTime));
        if(ex != null){
            System.out.println("The exception is" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
