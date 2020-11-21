package com.esprit.getway.communication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GetwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayServerApplication.class, args);
	}

}
