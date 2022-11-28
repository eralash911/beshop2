package com.shein.beshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class BeshopApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BeshopApplication.class, args);
		PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
		System.out.println(encoder.encode("pass"));
	}

}
