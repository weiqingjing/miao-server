package com.ding.ding.miao.server.common;


import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

// https://hc.apache.org/httpcomponents-client-5.1.x/quickstart.html
public class HttpClientUtils {
    public static String post(String url, String json) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);

            try (CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
                System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
                HttpEntity entity2 = response2.getEntity();

                EntityUtils.consume(entity2);

                String result = EntityUtils.toString(response2.getEntity(), "UTF-8");
                System.out.println("返回结果:" + result);

                return result;
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

//    public static String post(String url, String json) {
//        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//            String url = "https://api.weixin.qq.com/wxa/business/getuserphonenumber?access_token=60_mjIezAf5vNQjM0P1JcS4Fm-7hm1rsTnlxIfSePoTtxOunZnFPG4kIYbxvQG3WNvZ8KOLhM2YzBr-XzPKR9seoGGPTscg3PgBxgrgWJZYQHonMHwT_SK0yQ10Ld94woxNRiOc1n7ykH0ktNX2WBPaACAJOC";
//            HttpPost httpPost = new HttpPost(url);
//            httpPost.setHeader("Content-Type", "application/json");
//
//            //方法一
////            List<NameValuePair> body = new ArrayList<>();
////            body.add(new BasicNameValuePair("code", code));
////            httpPost.setEntity(new UrlEncodedFormEntity(body));
//
//            //方法二
//            String json = "{\"code\":\"d08185df28bec429947fca48e98269b0d6b1dc3aa23ac6d7a2ce4637085deead\"}";
//            StringEntity entity = new StringEntity(json);
//            httpPost.setEntity(entity);
//
//            try (CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
//                System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
//                HttpEntity entity2 = response2.getEntity();
//                // do something useful with the response body
//                // and ensure it is fully consumed
//                String result;
//                try {
//                    result = EntityUtils.toString(response2.getEntity(), "UTF-8");
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("返回结果:" + result);
//
//                EntityUtils.consume(entity2);
//
//
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return "明文";
//    }
}
