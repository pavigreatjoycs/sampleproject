package com.java.basics;

public class CCDemo {
	
	public CCDemo() {
		this(7);
		System.out.println("zero arg");
	}

	public CCDemo(int i) {
		this("Hello");
		System.out.println("int arg");
	}

	public CCDemo(String string) {
		this(2,4.3);
		System.out.println("String arg");
	}

	public CCDemo(int i, double d) {
		this(3.4,5);
		System.out.println("int double arg");
	}

	public CCDemo(double d, int i) {
		System.out.println("double int arg");
	}

	public static void main(String[] args) {
		CCDemo demo = new CCDemo();
	}

}
