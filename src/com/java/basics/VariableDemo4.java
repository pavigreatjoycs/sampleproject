package com.java.basics;

public class VariableDemo4 {

	static int age=23;
	
	public static void m1() {
		int age =30;
		System.out.println(age);
		System.out.println(VariableDemo4.age);
		
	}
	public static void main(String[] args) {

		m1();
		System.out.println(VariableDemo4.age);
		
	}

}
