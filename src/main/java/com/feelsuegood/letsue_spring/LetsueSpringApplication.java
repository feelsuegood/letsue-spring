package com.feelsuegood.letsue_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LetsueSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsueSpringApplication.class, args);

		var test = new Test();
		test.hello();
	}

}

class Test {
	String name = "Ham";

	void hello (){
		System.out.println("hello");
	}
}