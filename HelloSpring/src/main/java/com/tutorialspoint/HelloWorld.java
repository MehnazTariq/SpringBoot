package com.tutorialspoint;

import org.springframework.stereotype.Component;



public class HelloWorld {
	private String message1;

	private String message2;
	
	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public  HelloWorld ()
	{		
		System.out.println("Hello World constructor is called");
	}
	
	public void setMessage1(String message) {
		this.message1 = message;
	}

	public void getMessage1() {
		System.out.println("Your Message : " + message1);
	}

	public void init(){
	      System.out.println("HelloWorld Bean init method called.");
	   }
	   public void destroy() {
	      System.out.println("HelloWorld Bean destroy method called.");
	   }



}
