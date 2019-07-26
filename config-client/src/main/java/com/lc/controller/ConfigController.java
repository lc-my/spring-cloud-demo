package com.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth liuchong
 * @data 2019-07-26 17:45
 **/
@RestController
public class ConfigController {


    @Value("${info.profile}")
    String info;

    @GetMapping("/info")
    public String info(){
        return info;
    }
}
