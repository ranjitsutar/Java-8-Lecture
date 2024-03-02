package com.ranjit.java8.example.seriadesria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerAndDeserExample {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		
		Pen pen = new Pen();
		
		FileOutputStream fileOutputStream = new FileOutputStream("convert.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(pen);
		
		
		FileInputStream fileInputStream= new FileInputStream("convert.ser");
		ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
		Pen penobject =(Pen) objectInputStream.readObject();

		
		
		
		
		
		
		
		
		
	}
	
}
class Pen implements Serializable{
	
	public void m1() {
		int price=10;
		String colour="red";	
		
	}
	
	

}