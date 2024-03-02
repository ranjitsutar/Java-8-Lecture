package com.ranjit.java8.example;

import java.util.stream.IntStream;

public class Java7vsJava8 {
	public static void main(String[] args) {
		//Before
		int total=0;
		for (int i = 0; i <=50; i++) {
			total +=i;
		}
		System.out.println( "total: "+total);

		// After
		
		int total1= IntStream.range(0, 50)
				.map(Integer :: new)
				.sum();
		
		System.out.println( "total: "+total1);
	}


}
