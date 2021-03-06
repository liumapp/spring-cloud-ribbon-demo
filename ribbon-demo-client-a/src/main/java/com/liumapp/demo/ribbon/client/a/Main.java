package com.liumapp.demo.ribbon.client.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.liumapp.demo.ribbon.client.a"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}
