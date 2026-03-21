package com.pkg.exceptions;

public class DemoException {

	public static void main(String[] args) {

		System.out.println("start");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			
		}
		System.out.println("end");
	}

}
