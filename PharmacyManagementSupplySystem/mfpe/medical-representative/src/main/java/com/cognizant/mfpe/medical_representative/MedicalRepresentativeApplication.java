package com.cognizant.mfpe.medical_representative;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MedicalRepresentativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalRepresentativeApplication.class, args);
    }
}
