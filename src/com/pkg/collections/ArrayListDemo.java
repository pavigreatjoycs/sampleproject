package com.pkg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(8);
		list.add(8.9);
		list.add("archana");
		list.add(false);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(8);
		ilist.add(6);
		ilist.add(3);
		ilist.add(5);
		ilist.add(9);
		
		Collections.sort(ilist);
		for(Integer i:ilist) {
			System.out.println(i);
		}
	}

}
