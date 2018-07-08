package com.brownfield.pss.luggage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient 
@EnableSwagger2 
@SpringBootApplication
public class LuggageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LuggageApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
