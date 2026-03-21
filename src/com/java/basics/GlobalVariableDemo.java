package com.java.basics;

public class GlobalVariableDemo {

	static int a=1;
	double b=3.5;
	
	public static void test() {
		System.out.println(a);
		GlobalVariableDemo g1 = new GlobalVariableDemo();
		System.out.println(g1.b);
	}
	public static void main(String[] args) {

		System.out.println(a);
		GlobalVariableDemo g = new GlobalVariableDemo();
		System.out.println(g.b);
		GlobalVariableDemo.test();
	}

}
