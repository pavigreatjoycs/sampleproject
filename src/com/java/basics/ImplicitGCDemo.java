package com.java.basics;
class Father1{
	Father1(){
		System.out.println("MY father constructor");
	}
}

class Son1 extends Father1{
	Son1(){
		System.out.println("My child constructor");
		
	}
}
public class ImplicitGCDemo {

	public static void main(String[] args) {

		Son1 son1= new Son1();
		
	}

}
