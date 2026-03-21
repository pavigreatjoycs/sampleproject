package com.java.basics;

class Father{
	Father(int a){
		System.out.println("Father constructor");
	}
}

class Son extends Father{
	Son(){
		super(10);
		System.out.println("Son constructor");
	}
}
public class GCDemo { //Global Constructor Chaining

	public static void main(String[] args) {

		Son son = new Son();
		
		
	}

}
