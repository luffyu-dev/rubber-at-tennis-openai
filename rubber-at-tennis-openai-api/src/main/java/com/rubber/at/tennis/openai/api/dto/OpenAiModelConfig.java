package com.rubber.at.tennis.openai.api.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luffyu
 * Created on 2023/12/27
 */
@Data
public class OpenAiModelConfig {


    /**
     * 发送请求的url
     */
    private  String url;

    /**
     * 超时时间 ms
     */
    private  Integer timeOut = 20000;

    /**
     * 请求头
     */
    private  Map<String,String> header = new HashMap<>();

    /**
     * 消息体
     */
    private  JSONObject req = new JSONObject();

}
