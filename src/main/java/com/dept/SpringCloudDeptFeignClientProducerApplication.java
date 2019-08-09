package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDeptFeignClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDeptFeignClientProducerApplication.class, args);
	}

}
