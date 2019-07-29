package com.lc.eurekaconsumer.server;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @auth liuchong
 * @data 2019-07-29 10:19
 **/
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
