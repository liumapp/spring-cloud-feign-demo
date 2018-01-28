package com.liumapp.demo.hystrix.customer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liumapp on 1/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService () {
        return restTemplate.getForEntity("http://DEMO-CLIENT",String.class).getBody();
    }

    public String helloFallBack () {
        return "hystrix find client'server have error";
    }

}
