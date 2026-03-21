package com.java.basics;

public class NonStaticWithinStaticMembers {
//non static
	int empId;
	String name;
	
	public void employeeInfo() {
		System.out.println("This is employee info "+ empId +" " + name);
	}
	
	public static void main(String[] args) {

		//to access non static members creating an instance of the class
		NonStaticWithinStaticMembers obj = new NonStaticWithinStaticMembers();
		obj.empId=123456;
		obj.name="Mahesh";
		System.out.println(obj.empId);
		System.out.println(obj.name);
		obj.employeeInfo();
		
		//
	}

}
