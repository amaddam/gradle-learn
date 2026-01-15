package com.self.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.self")
@MapperScan("com.self.order.mapper")
@EnableDiscoveryClient
public class OrderMainStarterApp {

    public static void main(String[] args) {
        try {
            SpringApplication.run(OrderMainStarterApp.class,args);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}