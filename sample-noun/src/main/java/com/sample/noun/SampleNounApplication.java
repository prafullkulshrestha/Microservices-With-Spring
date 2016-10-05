package com.sample.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SampleNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleNounApplication.class, args);
	}
}
