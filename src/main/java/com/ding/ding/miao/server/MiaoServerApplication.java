package com.ding.ding.miao.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:important.properties"})
@MapperScan("com.ding.ding.miao.server.mapper")
@SpringBootApplication
public class MiaoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoServerApplication.class, args);
	}

}
