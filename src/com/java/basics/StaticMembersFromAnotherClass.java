package com.java.basics;

class Employees{
	static int companyId=888;
	static String companyName="HAL";
	
	static void show() {
		System.out.println("This is just a static show method");
	}
}

public class StaticMembersFromAnotherClass {

	public static void main(String[] args) {

		System.out.println(Employees.companyId);
		System.out.println(Employees.companyName);
		Employees.show();
		
	}

}
