package com.liumapp.demo.hystrix.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liumapp on 1/26/18 9:09 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication(scanBasePackages = {"com.liumapp.demo.hystrix.customer"})
public class Main {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}
