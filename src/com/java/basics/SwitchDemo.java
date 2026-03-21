package com.java.basics;

import java.util.Scanner;

public class SwitchDemo {
//for switch we can pass values/expression of datatypes-byte , short, int, char, String
//for swich we CANNOT pass values/expresssion of datatypes-long,float,double,boolean
	public static void main(String[] args) {

		System.out.println("Enter the marks");
		Scanner scn=new Scanner(System.in);
		int marks= scn.nextInt();
		char category='z';
		if(marks>80) {
			category='a';
		}else if(marks<80 && marks>=60) {
			category='b';
		}else if(marks<60 && marks>=35) {
			category='c';
		}
		System.out.println("Grade is ");
		switch(category) {
		case 'a': System.out.println("Distinction");
		           break;
		case 'b':System.out.println("Second Class");
		          break;
		case 'c':System.out.println("Third class");
				  break;
		default: System.out.println("Fail");
		}
		
		
	}

}
