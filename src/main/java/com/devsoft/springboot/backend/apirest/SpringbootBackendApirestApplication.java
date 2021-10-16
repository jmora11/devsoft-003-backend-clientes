package com.devsoft.springboot.backend.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootBackendApirestApplication implements CommandLineRunner {

	@Autowired
	public BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApirestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*String password = "12345";
		for(int i = 0; i < 2; i ++) {
			String passworBrypt =passwordEncoder.encode(password);
			System.out.println("PASSWORD: "+passworBrypt);
		}*/
		System.out.println("-- Hola -- DEVSOFT --");
	}
}
