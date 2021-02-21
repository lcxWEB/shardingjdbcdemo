package com.atguigu.shardingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.atguigu.shardingjdbcdemo.mapper")
@SpringBootApplication
public class ShardingjdbcdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingjdbcdemoApplication.class, args);
    }

}
