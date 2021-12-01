package com.database.connection.spring.boot.mongo.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import com.database.connection.spring.boot.mongo.connection.models.User;
import com.database.connection.spring.boot.mongo.connection.repositories.UserRepository;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class Application implements CommandLineRunner{
	
	private final UserRepository userRepository;
	
	
    @Autowired
	public Application(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		if(userRepository.findAll().isEmpty()) {
			
			userRepository.save(new User("mahesh","rohit"));
			userRepository.save(new User("bob","smith"));
			
		}
		
		for(User user:userRepository.findAll()) {
			System.out.println(user);
		}
		
		
	}

}
