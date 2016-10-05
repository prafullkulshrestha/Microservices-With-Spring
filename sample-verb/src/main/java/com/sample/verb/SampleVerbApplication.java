package com.sample.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SampleVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleVerbApplication.class, args);
	}
}
