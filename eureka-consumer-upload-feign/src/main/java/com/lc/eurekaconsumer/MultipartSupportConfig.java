package com.lc.eurekaconsumer;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auth liuchong
 * @data 2019-07-26 15:52
 **/
@Configuration
public class MultipartSupportConfig {
    @Bean
    public Encoder feignFormEncoder(){
        return new SpringFormEncoder();
    }
}
