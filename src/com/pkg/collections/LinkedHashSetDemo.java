package com.pkg.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(7);
		lhs.add(8);
		lhs.add(6);
		System.out.println(lhs);
		
		for(Integer i:lhs) {
			System.out.println(i);
		}
	}

}
