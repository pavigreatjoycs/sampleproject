package com.java.basics;

class Account{
	String name;
	long accno;
	double balance;
	String ifsc;
	String branch;
	static String bankName="SBI";
	
	public Account(String name, long accno, String ifsc, String branch) {
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.branch=branch;
	}
	
	public static void displayBankName() {
		System.out.println("Bank name " + bankName);
	}
	
	public void displayDetails() {
		System.out.println("Name :"+ name);
		System.out.println("Account number " + accno);
		System.out.println("ifsc "+ ifsc);
		System.out.println("branch " + branch);
	}
}
public class BankExample {

	public static void main(String[] args) {

		
	}

}
