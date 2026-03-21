package com.java.basics;

public class StaticVarLocalVarDemo {

	static int a=100;
	
	public static void run() {
		System.out.println("within run a is " + a);
	}
	public static void main(String[] args) {

		int a=888;
		System.out.println(a);
		System.out.println(StaticVarLocalVarDemo.a);
		
		run();
		
	}

}
