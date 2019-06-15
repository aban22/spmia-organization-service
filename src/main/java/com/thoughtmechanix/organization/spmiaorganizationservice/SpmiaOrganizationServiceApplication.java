package com.thoughtmechanix.organization.spmiaorganizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableFeignClients
@SpringBootApplication
public class SpmiaOrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmiaOrganizationServiceApplication.class, args);
	}

}
