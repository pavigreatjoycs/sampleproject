package com.pkg.exceptions;

import java.util.Scanner;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(){
		
	}
	public static void main(String[] args) {
		int balance = 1000;
		Scanner scn = new Scanner(System.in);

		int amount = scn.nextInt();
		try {
			if(balance < amount) {
				throw new InsufficientBalanceException();
			}else {
				System.out.println("Balance left after withdrawal " + (balance-amount));
			}
		}catch(InsufficientBalanceException ie) {
			ie.printStackTrace();
		}
		
	}

}
