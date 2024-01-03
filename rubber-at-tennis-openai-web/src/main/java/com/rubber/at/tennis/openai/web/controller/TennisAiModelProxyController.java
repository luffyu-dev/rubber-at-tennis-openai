package com.rubber.at.tennis.openai.web.controller;

import cn.hutool.http.HttpRequest;
import com.rubber.at.tennis.openai.api.dto.OpenAiModelConfig;
import com.rubber.base.components.util.annotation.NeedLogin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luffyu
 * Created on 2023/12/27
 */
@RestController
@RequestMapping("/proxy")
public class TennisAiModelProxyController {



    @PostMapping("/post")
    @NeedLogin(request = false)
    public String post(@RequestBody OpenAiModelConfig openAiModelConfig){
        return HttpRequest
                    .post(openAiModelConfig.getUrl())
                    .headerMap(openAiModelConfig.getHeader(), true)
                    .body(openAiModelConfig.getReq().toJSONString())
                    .timeout(openAiModelConfig.getTimeOut())
                    .execute().body();
    }



    @PostMapping("/get")
    @NeedLogin(request = false)
    public String get(@RequestBody OpenAiModelConfig openAiModelConfig){
        return   HttpRequest
                .get(openAiModelConfig.getUrl())
                .headerMap(openAiModelConfig.getHeader(), true)
                .timeout(openAiModelConfig.getTimeOut())
                .execute().body();


    }
}
