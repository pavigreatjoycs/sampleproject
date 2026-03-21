package com.pkg.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayStoreExceptionDemo {

	public static void main(String[] args) {

		String s[]= {"K","Z","B"};
		Arrays.sort(s, new MyCompss());
		for(String st:s) {
			System.out.println(st);
		}
		List l = Arrays.asList(s);
		System.out.println(l);
		l.set(1, "J");
		System.out.println(l);
//		l.add("C");//UnsupportedOperation
//		l.remove(2);//UnsupportedOperation
		
//		l.set(1,3);//ArrayStoreException
		
	}

}

class MyCompss implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
