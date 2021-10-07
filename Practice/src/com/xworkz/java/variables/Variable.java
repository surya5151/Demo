package com.xworkz.java.variables;

public class Variable {
	
	static int s=100;  //Static variable
	
	void method() {
		
		int s1=200;  	//Local variable
	}
	
	public static void main(String[] args) {
		
		int s3=300;  //Instance variable
		
		System.out.println(s3);
		
	}

}
