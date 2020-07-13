package com.application.MBBusBaseSpring;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

@SpringBootApplication
@ComponentScan
public class MbBusBaseSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbBusBaseSpringApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializer(UserRepository repository){
		return args -> {
			Optional<User> userOptional = repository.findByUsername("admin");
			if(!userOptional.isPresent()){
				User user = new User();
				user.setUsername("admin");
				user.setPassword("$2a$10$wdN0CXWAD7vJ0bIxOHasI.Y.5LJrYanLW/NaOFEhPNvcdaJUR4SfS");
				user.setRole("ROLE_ADMIN");
				repository.save(user);
			}
		};
	}
}
