package com.pro.isbportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IsbPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsbPortalApplication.class, args);
	}

}
