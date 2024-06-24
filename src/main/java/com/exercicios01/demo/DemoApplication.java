package com.exercicios01.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Lista01 lista01 = new Lista01();
		Lista02 lista02 = new Lista02();
		Lista03 lista03 = new Lista03();
		Lista04 lista04 = new Lista04();

        lista04.ex05();
		
	}

}
