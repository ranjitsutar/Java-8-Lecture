package com.ranjit.java8.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7vsJava8Example2 {
	
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Ranjit", "Chandan", "Santosh","Kumbhar","Ranjit");
		//Before
		ArrayList<Object> distinct1 = new ArrayList<>();
		for(String name : asList) {
			if(!distinct1.contains(name)) {
				distinct1.add(name);
			}
		}
		System.out.println(distinct1);
		
		//After
		
		List<String> distinct2 = asList.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinct2);

	}

}
