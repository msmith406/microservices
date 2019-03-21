package org.chris.springboot.microservices.demo.eurkeanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkeaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkeaNamingServerApplication.class, args);
	}

}
