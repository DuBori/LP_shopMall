package com.LeePark.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

/*	private static final Logger log= LogManager.getLogger(ShopApplication.class);

	@Bean
	public BCryptPasswordEncoder encoder(){

		return new BCryptPasswordEncoder();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
