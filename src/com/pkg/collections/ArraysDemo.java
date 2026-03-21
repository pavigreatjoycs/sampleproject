package com.pkg.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {15,20,8,1,88,7};
		System.out.println("primitive arrays before sorting");
		for(int a1:a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("*****");
		for(int a1:a) {
			System.out.println(a1);
		}
		System.out.println(Arrays.binarySearch(a, 9));
		System.out.println(Arrays.binarySearch(a, 20));
		String s[]= {"Shivaji","Rajnikanth","Ajith","Vijay","Vikram","Surya"};
		Arrays.sort(s,new MyComp());
		for(String str:s) {
			System.out.println(str);
		}
	}

}

class MyComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
