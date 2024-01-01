package com.phuocnguyen.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication(
		scanBasePackages = {"com.phuocnguyen.springcoredemo",
							"com.phuocnguyen.util"
		}
) */

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
