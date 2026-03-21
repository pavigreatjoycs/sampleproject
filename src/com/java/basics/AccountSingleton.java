package com.java.basics;

public class AccountSingleton {

	private static AccountSingleton as=null;
	private AccountSingleton() {
		System.out.println("Object created");
		
	}
	
	private static void createObject() {
		if(as == null) {
			as = new AccountSingleton();
		}else
		{
			System.out.println("cannot create object");
		}
	}
	public static void main(String[] args) {
		AccountSingleton.createObject();
		AccountSingleton.createObject();
		AccountSingleton.createObject();

	}

}
