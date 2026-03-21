package com.java.basics;

public class IncrementDecrementDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1, b=2;
		//manual calculation 
		//1 - 2 + 2 - 1 =0
		System.out.println(--b - ++a + ++b  - --a);
		
		int i=0;
		i= i++ - --i + ++i - i--;
		//manual calculation
		//i= 0 + 0 + 1 - 1;=0
		System.out.println("**** i "+ i);
	}

}
