package com.liumapp.demo.hystrix.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liumapp on 1/25/18 5:34 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(path = "")
    public String index (ModelMap model) {
        return "Hello , this is a customer  .";
    }

}
