package com.lc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auth liuchong
 * @data 2019-07-26 15:01
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignUploadServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignUploadServerApplication.class).web(true).run(args);
    }
}
