package com.java.basics;

public class LocalVariable {

	int b=22;
	public static void myMethod() {
		int a =20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		myMethod();
		System.out.println(new LocalVariable().b);
	}
}
