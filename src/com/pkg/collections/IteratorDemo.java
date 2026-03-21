package com.pkg.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("Nandini");
		l.add("Navya");
		l.add("Adarsh");
		l.add("Binny");
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
