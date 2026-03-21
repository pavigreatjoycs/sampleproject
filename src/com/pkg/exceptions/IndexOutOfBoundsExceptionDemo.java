package com.pkg.exceptions;

public class IndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int a[]= {3,5,7};
		try {
			System.out.println("Value at 99th index is " + a[99]);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Index out of bounds" + aie.toString());
			System.out.println(aie.getMessage());
		}
	}
}
