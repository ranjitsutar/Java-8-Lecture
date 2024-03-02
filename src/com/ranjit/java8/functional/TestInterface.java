package com.ranjit.java8.functional;

@FunctionalInterface
public interface TestInterface {

	public void add();
	
	default String hello() {
		return "Hello";
	}
	
	static boolean isTrue() {
		return true;
	}
	
}
