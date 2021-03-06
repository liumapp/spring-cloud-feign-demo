package com.liumapp.demo.feign.customer.controller;

import com.liumapp.demo.feign.api.entity.User;
import com.liumapp.demo.feign.customer.service.HelloService;
import com.liumapp.demo.feign.customer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 1/21/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer" , method = RequestMethod.GET)
    public String helloConsumer () {
        return helloService.hello();
    }

    @RequestMapping("/feign-consumer2")
    public String helloConsumer2 () {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n<br>");
        sb.append(helloService.hello("lm")).append("\n<br>");
        sb.append(helloService.hello("lm" , 24)).append("\n<br>");
        sb.append(helloService.hello(new User("lm" , 24))).append("\n<br>");
        return sb.toString();
    }

    @RequestMapping("/feign-consumer3")
    public String helloConsumer3 () {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("sq")).append("\n<br>");
        sb.append(refactorHelloService.hello("sq" , 24)).append("\n<br>");
        sb.append(refactorHelloService.hello(new User("sq" , 24))).append("\n<br>");
        return sb.toString();
    }

}
