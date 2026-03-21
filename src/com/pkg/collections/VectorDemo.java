package com.pkg.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
	    System.out.println(v.capacity());
	    v.add("archana");
	    v.add("Mary");
	    v.add(8);
	    for(int i=0;i<=5;i++) {
	    	v.addElement(i);
	    }
	    
	    System.out.println(v);
	    System.out.println(v.get(8));
	    
	    System.out.println(v.indexOf(8));
	    System.out.println(v.size());
	}

}
