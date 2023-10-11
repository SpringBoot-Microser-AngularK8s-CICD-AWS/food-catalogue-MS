package com.codedecode.foodcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FoodCatalogueMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodCatalogueMicroserviceApplication.class, args);
	}

//RestTemplate is a synchronous REST client which performs
// HTTP requests using a simple template-style API
@Bean //applied on a method to specify that it returns a bean to be managed by Spring context
@LoadBalanced //eureka find the instance not busy to response to our request
public RestTemplate getRestemplate(){
	return new RestTemplate();
}

}