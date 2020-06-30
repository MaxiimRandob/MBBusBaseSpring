package com.application.MBBusBaseSpring;

import com.application.MBBusBaseSpring.entity.Route;
import com.application.MBBusBaseSpring.service.RouteService;
import com.application.MBBusBaseSpring.service.impl.RouteServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan
public class MbBusBaseSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbBusBaseSpringApplication.class, args);
	}
}
