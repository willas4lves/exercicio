package com.exercicios01.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Lista01 lista01 = new Lista01();
		Lista02 lista02 = new Lista02();

        lista02.ex07();
		
	}

}
