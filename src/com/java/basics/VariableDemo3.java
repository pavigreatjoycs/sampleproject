package com.java.basics;

public class VariableDemo3 {

	int a=33;
	public void play(){
		int a = 44;
		System.out.println(a);
		System.out.println(new VariableDemo3().a);
	    System.out.println(this.a);
	}
	public static void main(String[] args) {

		VariableDemo3 v = new VariableDemo3();
		v.play();
	}

}
