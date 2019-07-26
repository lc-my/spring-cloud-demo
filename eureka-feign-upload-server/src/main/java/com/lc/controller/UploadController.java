package com.lc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @auth liuchong
 * @data 2019-07-26 15:06
 **/
@RestController
public class UploadController {

    @PostMapping(value = "/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart(value = "file") MultipartFile file){
        return file.getOriginalFilename();
    }
}
