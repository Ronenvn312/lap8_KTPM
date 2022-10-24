package com.example.jparesttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JpaRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaRestTemplateApplication.class, args);
	}

}
