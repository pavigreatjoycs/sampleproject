package com.java.basics;

public class ReferenceVariableDemo {

	public static void main(String[] args) {
       //Within a primitive variable we can't store address of an object
		//int a = new ReferenceVariableDemo();-not allowed
		
		
		//Within a reference variable we cannot store primitive values
		//ReferenceVariableDemo r = 10;//Type mismatch: cannot convert from int to ReferenceVariableDemo
		
		
		int r=10;
		ReferenceVariableDemo demo=new ReferenceVariableDemo();
		
		System.out.println(r);
		System.out.println(demo);
	}

}
