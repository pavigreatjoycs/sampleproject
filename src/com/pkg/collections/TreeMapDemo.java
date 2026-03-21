package com.pkg.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer,String> tmap = new TreeMap<>(new MyComparators());
		tmap.put(111, "ZZZ");
		tmap.put(333, "CCC");
		tmap.put(777, "KKK");
		tmap.put(999, "AAA");
		
		System.out.println(tmap);
	}

}

class MyComparators implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
	    return i2.compareTo(i1);
	    
	}
	
}
