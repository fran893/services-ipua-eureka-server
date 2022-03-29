package com.app.ipau.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicesIpauEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesIpauEurekaServerApplication.class, args);
	}

}
