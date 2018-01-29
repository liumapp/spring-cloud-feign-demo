package com.liumapp.demo.feign.api.service;

import com.liumapp.demo.feign.api.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liumapp on 1/29/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping("/hello1")
    String hello (@RequestParam("name") String name);

    @RequestMapping("/hello2")
    User hello (@RequestHeader("name") String name , @RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello (@RequestBody User user);

}
