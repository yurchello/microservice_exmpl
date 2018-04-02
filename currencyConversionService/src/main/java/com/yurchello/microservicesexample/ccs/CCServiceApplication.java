package com.yurchello.microservicesexample.ccs;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.yurchello.microservicesexample.ccs")
//@EnableDiscoveryClient
public class CCServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CCServiceApplication.class, args);
    }
}