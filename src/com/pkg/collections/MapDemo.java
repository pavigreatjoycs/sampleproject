package com.pkg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(100, "Ravi");
		m.put(102, "Latha");
		m.put(101, "Kasturi");
		
		Set s = m.entrySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set ss = m.keySet();
		System.out.println(ss);
		
	}

}
