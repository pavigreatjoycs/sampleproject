package com.pkg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();
		hmap.put("Chiranjeevi", 700);
		hmap.put("Krishna", 400);
		hmap.put("Tejas", 800);
		hmap.put("Vijay", 900);
		hmap.put("Surya", 800);
		
		System.out.println(hmap);
		Collection c = hmap.values();
		System.out.println(c);
		Set s = hmap.keySet();
		System.out.println(s);
		
		Set entry = hmap.entrySet();
		System.out.println(entry);
		
		Iterator itr = entry.iterator();
		while(itr.hasNext()) {
			Map.Entry ent = (Map.Entry)itr.next();
			String name=(String) ent.getKey();
			System.out.println("Key is " +name);
			System.out.println("Value is "+ ent.getValue());
			if (ent.getKey().equals("Surya")) {
				ent.setValue(999);
			}
		}
		
	}

}
