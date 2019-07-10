package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class J1902TpUsermanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(J1902TpUsermanagerApplication.class, args);
	}

}
