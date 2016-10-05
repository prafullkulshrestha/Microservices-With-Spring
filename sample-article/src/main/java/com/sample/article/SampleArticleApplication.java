package com.sample.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SampleArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleArticleApplication.class, args);
	}
}
