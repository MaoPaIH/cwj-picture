package com.cwj.cwjpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.cwj.cwjpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class CwjPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CwjPictureBackendApplication.class, args);
    }

}
