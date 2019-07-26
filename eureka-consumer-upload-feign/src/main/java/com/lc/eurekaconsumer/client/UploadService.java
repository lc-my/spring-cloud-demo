package com.lc.eurekaconsumer.client;

import com.lc.eurekaconsumer.MultipartSupportConfig;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @auth liuchong
 * @data 2019-07-26 14:35
 **/
@FeignClient(name = "upload-server",configuration = MultipartSupportConfig.class)
public interface UploadService {
    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile(@RequestPart("file") MultipartFile file);


}
