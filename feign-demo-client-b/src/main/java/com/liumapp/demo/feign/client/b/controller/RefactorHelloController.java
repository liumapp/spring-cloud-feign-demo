package com.liumapp.demo.feign.client.b.controller;

import com.liumapp.demo.feign.api.entity.User;
import com.liumapp.demo.feign.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 1/29/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name , age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + " , are you " + user.getAge() + " age ? ";
    }

}
