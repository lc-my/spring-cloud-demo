package com.lc.eurekaconsumer.controller;

import com.lc.eurekaconsumer.server.ConsumerService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auth liuchong
 * @data 2019-07-26 14:05
 **/
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;


    @GetMapping("/consumer")
    public String dc(){
        return consumerService.consumer();
    }



}
