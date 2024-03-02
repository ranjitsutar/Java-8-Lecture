package com.ranjit.java8.functional;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> c1= (s) -> System.out.println(s.toUpperCase());
//		c1.accept("java8");
		
		Consumer<String> c2= (s) -> System.out.println(s.toLowerCase());
//		c2.accept("java8");
		c1.andThen(c2).accept("java8");
		
	}
}
