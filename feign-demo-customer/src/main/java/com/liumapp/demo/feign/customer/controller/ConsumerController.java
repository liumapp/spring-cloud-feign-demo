package com.liumapp.demo.feign.customer.controller;

import com.liumapp.demo.feign.customer.service.HelloService;
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

    @RequestMapping(value = "/ribbon-consumer" , method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

}