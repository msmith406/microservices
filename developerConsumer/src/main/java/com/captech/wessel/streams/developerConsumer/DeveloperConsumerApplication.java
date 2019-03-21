package com.captech.wessel.streams.developerConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeveloperConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperConsumerApplication.class, args);
	}

}
