package com.lc.eurekaconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerFeignApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerFeignApplication.class).web(true).run(args);
    }

}
