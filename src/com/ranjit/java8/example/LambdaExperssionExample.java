package com.ranjit.java8.example;

public class LambdaExperssionExample {
	
	public static void main(String[] args) {
		
//		Using Runnable
		//Before
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Thread 1");
			}
		};
		
		Thread thread1 = new Thread(r);
		thread1.start();
		
		//After
		
		Runnable r2= ()->System.out.println("Thread 2");
		Thread thread2 = new Thread(r2);
		thread2.start();
		
		// Using Thread
		//Before 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 3");
				
			}
		}).start();
		
		new Thread(()->System.out.println("Thread 5")).start();;

	}

}
