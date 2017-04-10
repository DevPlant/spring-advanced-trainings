package com.devplant.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoodByeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodByeApplication.class, args);
	}

}
