package com.test.spc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpcServerApplication.class, args);
	}
}
