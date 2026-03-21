package com.java.basics;

public class NonStaticMembersWithinSameClass {

	int zooId=777;
	String zooName="Bannergatta zoo";
	
	public static void main(String[] args) {
		System.out.println(new NonStaticMembersWithinSameClass().zooId);
		System.out.println(new NonStaticMembersWithinSameClass().zooName);
	}

}
