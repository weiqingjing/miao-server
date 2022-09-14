package com.ding.ding.miao.server.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:important.properties"})
@MapperScan("com.ding.ding.miao.server.mapper")
@SpringBootApplication //使用SpringBoot方式执行单元测试，与mybatis 单元测试类平级，可以使 Spring Bean 的加载范围限定在当前包路径下
public class MapperTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperTestApplication.class, args);
    }

}
