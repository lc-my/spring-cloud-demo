package com.lc.eurekaconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerUploadFeignApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerUploadFeignApplication.class).web(true).run(args);
    }

}
