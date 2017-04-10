package com.devplant.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRegistryApplication.class, args);
	}
}
