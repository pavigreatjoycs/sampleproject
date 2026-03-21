package com.java.basics;

public class StringDemo {


	public static void main(String[] args) {

		String str="abracadabra";
		String s[]=new String[5];
		System.out.println(str.length());
		System.out.println(s.length);
		
		System.out.println(str.indexOf('d'));
		System.out.println(str.charAt(8));
		
		System.out.println(str.endsWith("ra"));
		System.out.println(str.equals("abracadabra"));
		System.out.println(str.hashCode());
		System.out.println(str.toString());
	}

}
