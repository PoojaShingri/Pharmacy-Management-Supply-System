package com.cognizant.mfpe.pharmacy_supply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableZuulProxy
public class PharmacySupplyApplication {
    public static void main(String[] args) {
        SpringApplication.run(PharmacySupplyApplication.class, args);
    }
}
