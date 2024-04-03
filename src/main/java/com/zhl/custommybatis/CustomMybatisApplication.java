package com.zhl.custommybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhl.custommybatis.database.mapper")
public class CustomMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomMybatisApplication.class, args);
    }
}
