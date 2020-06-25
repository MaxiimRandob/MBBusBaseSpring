package com.application.MBBusBaseSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MbBusBaseSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbBusBaseSpringApplication.class, args);
	}

}
