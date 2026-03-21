package com.pkg.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		Temp t = new Temp();
		hm.put(t, "Durga");
		System.out.println(hm);
		t=null;
		System.gc();
		System.out.println(hm);
		
		WeakHashMap m = new WeakHashMap();
		Temp tt = new Temp();
		m.put(tt, "Lakshmi");
		System.out.println(m);
		tt=null;
		System.gc();
		System.out.println(m);
		
	}

}

class Temp{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize called");
	}
}
