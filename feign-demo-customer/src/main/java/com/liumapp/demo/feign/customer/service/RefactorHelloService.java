package com.liumapp.demo.feign.customer.service;

import com.liumapp.demo.feign.api.service.*;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by liumapp on 1/31/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@FeignClient(value = "demo-client")
public interface RefactorHelloService extends com.liumapp.demo.feign.api.service.HelloService {
}
