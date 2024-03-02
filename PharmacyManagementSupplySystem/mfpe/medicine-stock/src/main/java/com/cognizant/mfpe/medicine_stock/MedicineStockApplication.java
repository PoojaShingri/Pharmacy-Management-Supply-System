package com.cognizant.mfpe.medicine_stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableZuulProxy
public class MedicineStockApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicineStockApplication.class, args);
    }
}
