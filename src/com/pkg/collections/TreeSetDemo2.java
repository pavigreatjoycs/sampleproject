package com.pkg.collections;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet<String>(new MyComparator());
		ts.add("Vidyut");
		ts.add("Vivaan");
		ts.add("Vihaan");
		ts.add("Anusha");
		ts.add("Arun");
		ts.add("Selva");
		System.out.println(ts);
		

	}

}

class MyComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
}


