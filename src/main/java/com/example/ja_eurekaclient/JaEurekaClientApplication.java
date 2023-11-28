package com.example.ja_eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JaEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaEurekaClientApplication.class, args);
    }

}
