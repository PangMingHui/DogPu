package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author fly
 * @create 2020-06-12 20:35
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";

    }
}
