package com.ding.ding.miao.server.common;

public class WeChatApiUtil {
    public static String DOMAIN = "https://api.weixin.qq.com";

    public static String API_GET_ACCESS_TOKEN = DOMAIN + "/cgi-bin/token";

    public static String API_GET_PHONE = DOMAIN + "/wxa/business/getuserphonenumber";
}
