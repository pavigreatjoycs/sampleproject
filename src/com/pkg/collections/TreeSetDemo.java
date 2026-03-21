package com.pkg.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(3);
		ts.add(5);
		ts.add(1);
		
		System.out.println(ts);
		
		for(Integer i:ts) {
			System.out.println(i);
		}
		
		Iterator<Integer> i = ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
