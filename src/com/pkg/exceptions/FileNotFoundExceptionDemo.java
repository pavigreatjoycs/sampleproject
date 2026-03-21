package com.pkg.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {

		try {
			FileReader fr=new FileReader("demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
