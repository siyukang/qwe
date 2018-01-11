package com.si.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018/1/11.
 */
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.si.mapper")
@ComponentScan(basePackages = {"com.si.controller","com.si.service"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
