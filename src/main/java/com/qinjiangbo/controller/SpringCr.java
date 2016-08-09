package com.qinjiangbo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Richard on 7/14/16.
 */
@Controller
@RequestMapping("/web")
public class SpringCr {

    @RequestMapping(value = "/home", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String home() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
