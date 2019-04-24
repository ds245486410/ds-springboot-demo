package com.hellen.springboot.dubboconsumerdemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerDemoApplication.class, args);
    }

}
