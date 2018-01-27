package com.liumapp.demo.hystrix.client.b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
