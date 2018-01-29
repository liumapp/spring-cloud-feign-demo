package com.liumapp.demo.feign.client.b.controller;

import com.liumapp.demo.feign.client.b.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/")
    public String index (ModelMap model) throws InterruptedException {
        ServiceInstance instance = client.getLocalServiceInstance();

        int sleepTime = new Random().nextInt(3000);
        System.out.println("sleepTime is : " + sleepTime);
        Thread.sleep(sleepTime);

        return "hello , this is client b demo";
    }

    @RequestMapping(value = "/hello1")
    public String hello (@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2")
    public User hello (@RequestHeader String name , @RequestHeader Integer age) {
        return new User(name , age);
    }

    @RequestMapping(value = "/hello3")
    public String hello (@RequestBody User user) {
        return "Hello " + user.getName() + " , is your age " + user.getAge() + " ? ";
    }

}
