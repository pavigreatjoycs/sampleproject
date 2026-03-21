package com.java.basics;

public class VariableDemo2 {

	static int a=20;
	
	public void play() {
		int a=10;
		System.out.println(a);
		System.out.println(VariableDemo2.a);
		System.out.println(new VariableDemo2().a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {

		VariableDemo2 v = new VariableDemo2();
		v.play();
		
	}

}
