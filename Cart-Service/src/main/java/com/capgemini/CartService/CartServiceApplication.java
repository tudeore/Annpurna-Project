package com.capgemini.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.capgemini.entity.Cart;
import com.capgemini.repository.CartRepository;

@SpringBootApplication
public class CartServiceApplication {
	
	@Autowired
	CartRepository cartService;
	
	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner cartService(CartRepository cartService) {
	return (env) ->{
		cartService.save(new Cart(101,15));
	};
	
	
}
}

