package com.lc.eurekaconsumer.controller;

import com.lc.eurekaconsumer.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    DcClient dcClient;


    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }
}
