package com.ding.ding.miao.server.common;

import org.springframework.stereotype.Component;

@Component
public class WeChatApi {

    public String getUserPhone(String code) {
        String json = "";
        return HttpClientUtils.post(WeChatApiUtil.API_GET_PHONE, json);
    }

}
