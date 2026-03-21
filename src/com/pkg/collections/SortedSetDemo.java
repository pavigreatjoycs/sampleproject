package com.pkg.collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet sset = new TreeSet();
		sset.add("Aishwarya");
		sset.add("Zeenat");
		sset.add("Manya");
		sset.add("Trisha");
		sset.add("Khushboo");
		
		System.out.println(sset.headSet("Khushboo"));
		System.out.println(sset);
		System.out.println(sset.tailSet("Khushboo"));
		System.out.println(sset.subSet("Khushboo", "Trisha"));
		
	}

}
