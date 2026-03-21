package com.java.basics;

public class PersonClassDemo {

	public String toString() {
		return "personstring";
	}
	
	public int hashCode() {
		return 10;
	}
	public static void main(String[] args) {

		PersonClassDemo pc = new PersonClassDemo();
		System.out.println(pc.toString());
		System.out.println(pc.hashCode());
	}

}
