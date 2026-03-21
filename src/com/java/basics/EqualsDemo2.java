package com.java.basics;

public class EqualsDemo2 {

	String str="";
	
	public EqualsDemo2(String str) {
		this.str=str;
	}
	
	public boolean equals(Object obj) {
		EqualsDemo2 ee=(EqualsDemo2)obj;
		return this.str.equals(ee.str);
	}
	public static void main(String[] args) {

		EqualsDemo2 ed = new EqualsDemo2("archana");		
		EqualsDemo2 ed2 = new EqualsDemo2("archana");

		
		System.out.println(ed.equals(ed2));
	}

}
