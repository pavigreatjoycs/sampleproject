package com.pkg.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(8);
		l.add(null);
		l.add("software");
		l.set(0,  "testing");
		l.remove(2);
		l.addFirst("Myna");
	    l.removeLast();
		System.out.println(l);
		
	}

}
