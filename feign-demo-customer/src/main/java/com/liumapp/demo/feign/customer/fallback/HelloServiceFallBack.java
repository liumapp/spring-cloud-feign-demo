package com.liumapp.demo.feign.customer.fallback;


import com.liumapp.demo.feign.api.entity.User;
import com.liumapp.demo.feign.customer.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liumapp on 2/1/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class HelloServiceFallBack implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "unknow name";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("unknow" , 0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "unknow user";
    }
}
