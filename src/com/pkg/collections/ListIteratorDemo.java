package com.pkg.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("EIGHT");
		list.add("Megha");
		list.add("Vishnu");
		list.add("Multiverse");
		
		ListIterator litr = list.listIterator();
		while(litr.hasNext()) {
			String s = (String)litr.next();
			if(s.equals("Megha")) {
				litr.set("Manyata");
			}
			if(s.equals("Multiverse")) {
				litr.add("Universe");
			}
			
			if(s.equals("Vishnu")) {
				litr.remove();
			}
		}
		System.out.println("**************");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
	}

}
