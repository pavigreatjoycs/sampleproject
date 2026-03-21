package com.pkg.exceptions;

import java.util.Scanner;

public class CantVoteDemo extends RuntimeException{

	public CantVoteDemo(String msg) {
		super(msg);
        
	}
	public static void main(String[] args) {
		System.out.println("Enter your age ");
		Scanner scn = new Scanner(System.in);
		int age=scn.nextInt();
		if(age<18) {
			throw new CantVoteDemo("Not eligible");
		}else {
			System.out.println("Yes, You can vote");
		}
	}

}
