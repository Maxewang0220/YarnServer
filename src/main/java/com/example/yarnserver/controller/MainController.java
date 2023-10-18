package com.example.yarnserver.controller;

import com.example.yarnserver.entity.UploadRequest;
import com.example.yarnserver.entity.UploadResponse;
import com.example.yarnserver.service.HiveService;
import com.example.yarnserver.service.SparkService;
import com.example.yarnserver.service.YarnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Slf4j
@RequestMapping("/main")
public class MainController {
    @Resource
    private HiveService hiveService;

    @Resource
    private SparkService sparkService;

    @Resource
    private YarnService yarnService;

    @PostMapping("/upload")
    @ResponseBody
    public Object uploadHive(@RequestBody UploadRequest uploadRequest) {
        log.info(uploadRequest.toString());
        return new UploadResponse(0, "success");
    }

}
