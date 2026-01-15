package com.self.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.self")
@MapperScan("com.self.user.mapper")
@EnableDiscoveryClient
@EnableFeignClients("com.self")
public class UserMainStarterApp {

    public static void main(String[] args) {
        try {
            SpringApplication.run(UserMainStarterApp.class,args);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
