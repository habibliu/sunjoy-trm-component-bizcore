package com.sunjoy.trm.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = { "com.sunjoy" })
public class BizCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizCoreServiceApplication.class, args);
	}
}
