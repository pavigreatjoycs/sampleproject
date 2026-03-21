package com.pkg.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(3);
		hs.add(3);
		hs.add(6);
		hs.add(2);
		hs.add(8);
		hs.add(null);
		
		System.out.println(hs);
		
		for(Integer i:hs) {
			System.out.println(i);
		}
	}

}
