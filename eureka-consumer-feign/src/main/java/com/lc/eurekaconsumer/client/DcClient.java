package com.lc.eurekaconsumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auth liuchong
 * @data 2019-07-26 14:35
 **/
@FeignClient(name = "eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
