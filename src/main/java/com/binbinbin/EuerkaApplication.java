package com.binbinbin;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerkaApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EuerkaApplication.class).web(true).run(args);
	}
}
