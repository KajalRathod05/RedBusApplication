package com.RedBus_Aapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RedBusAapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedBusAapplicationApplication.class, args);
	}

	
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
	
}
