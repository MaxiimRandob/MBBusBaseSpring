package com.application.MBBusBaseSpring;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@SpringBootApplication
@ComponentScan
public class MbBusBaseSpringApplication {

	private static final Logger LOG = LogManager.getLogger(MbBusBaseSpringApplication.class);

	public static void main(String[] args) {

		LOG.info("Project start");

		SpringApplication.run(MbBusBaseSpringApplication.class, args);
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "karab";
		String encodedPassword = passwordEncoder.encode(password);

		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		System.out.println();


		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);
	}

	@Bean
	public ApplicationRunner initializer(UserRepository repository){
		return args -> {
			Optional<User> userOptional = repository.findByUsername("admin");
			if(!userOptional.isPresent()){
				LOG.info("InMemory initialization with artificial user");
				User user = new User();
				user.setUsername("admin");
				user.setPassword("$2a$10$wdN0CXWAD7vJ0bIxOHasI.Y.5LJrYanLW/NaOFEhPNvcdaJUR4SfS");
				user.setRole("ROLE_ADMIN");
				LOG.info("username: " + user.getUsername());
				repository.save(user);
			}
		};
	}
}
