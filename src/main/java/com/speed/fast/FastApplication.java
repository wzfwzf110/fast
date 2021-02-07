package com.speed.fast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class FastApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastApplication.class, args);
	}

}
