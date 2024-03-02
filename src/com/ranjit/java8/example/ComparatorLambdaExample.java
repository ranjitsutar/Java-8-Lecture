package com.ranjit.java8.example;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		//Before
		System.out.println("Before");
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
		public int compare(Integer o1, Integer o2) {

				return o1.compareTo(o2);
			}
		};
		System.out.println(comparator.compare(10, 30));
		
		
		//After
		System.out.println("After");
		Comparator<Integer> comparator2= (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println(comparator2.compare(10, 3));

		//more simple
		Comparator<Integer> comparator3= ( o1, o2) -> o1.compareTo(o2);
		System.out.println(comparator3.compare(10, 10));

	}
}
