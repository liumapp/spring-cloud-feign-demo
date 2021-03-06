package com.liumapp.demo.feign.customer.service;

import com.liumapp.demo.feign.api.entity.User;
import com.liumapp.demo.feign.customer.fallback.HelloServiceFallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liumapp on 1/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@FeignClient(value = "demo-client" , fallback = HelloServiceFallBack.class)
public interface HelloService {

    @RequestMapping("/")
    String hello ();

    @RequestMapping("/hello1")
    String hello (@RequestParam("name") String name);

    @RequestMapping("/hello2")
    User hello (@RequestHeader("name") String name , @RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello (@RequestBody User user);

}
