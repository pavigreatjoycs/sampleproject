package com.pkg.exceptions;

public class ArithmeticExceptionDemo2 {

	public static void main(String[] args) {
		
		int a=5,b=0,c=0;
		try {
			 c=a/b;
		}catch(ArithmeticException ae) {
			System.out.println("cannot divide by 0" + ae.toString());
			System.out.println(ae.getMessage());
		}finally {
			b=1;
			c=a/b;
			System.out.println(c);
		}
		
		
	}
}
