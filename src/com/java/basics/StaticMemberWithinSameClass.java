package com.java.basics;

public class StaticMemberWithinSameClass {

	static String collegeName="New Horizon College";
	
	//static method
	static void display() {
		System.out.println("This is a static display");
	}
	public static void main(String[] args) {

		System.out.println(collegeName);
		display();
	}

}
