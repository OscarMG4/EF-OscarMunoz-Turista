package com.idat.pe.ef.OscarMunoz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfOscarMunozApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfOscarMunozApplication.class, args);
	}

}
