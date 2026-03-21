package com.pkg.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(8);
		list.add('a');
		list.add(null);
		list.add('a');
		
		list.add(2,'M');
		list.remove(4);
		
		
		System.out.println(list);
		
		ArrayList l1= new ArrayList();
		LinkedList l2 = new LinkedList();
		
		if(l1 instanceof Serializable) {
			System.out.println("Arraylist object instance of serializable");
		}
		
		if(l2 instanceof RandomAccess) {
			System.out.println("LinkedList is the instance of RandomAccess");
		}else {
			System.out.println("LinkedList is NOT the instance of Random Access");
		}
	}

}
