package com.liumapp.demo.feign.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liumapp on 1/26/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@FeignClient("demo-client")
public interface HelloService {

    @RequestMapping("/")
    String hello();

}
