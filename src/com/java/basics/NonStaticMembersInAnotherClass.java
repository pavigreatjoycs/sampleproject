package com.java.basics;

class MyEmp{
	int empId=9999;
	String empName="Ashok";
	
	public void show() {
		System.out.println(empId + " " + empName);
	}
}
public class NonStaticMembersInAnotherClass {

	public static void main(String[] args) {
		MyEmp memp = new MyEmp();
		System.out.println(memp.empId);
		System.out.println(memp.empName);
		
		memp.show();
	}
}
