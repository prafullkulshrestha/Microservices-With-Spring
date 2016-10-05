package com.sample.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SampleAdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAdjectiveApplication.class, args);
	}
}
