package com.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth liuchong
 * @data 2019-07-26 17:45
 **/
@RefreshScope
@RestController
public class ConfigController {


    @Value("${info.profile}")
    String info;

    @RequestMapping(value = "/info",method = {RequestMethod.GET,RequestMethod.POST})
    public String info(){
        return info;
    }
}
