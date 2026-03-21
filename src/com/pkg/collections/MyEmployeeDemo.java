package com.pkg.collections;

import java.util.TreeSet;

class MyEmployee implements Comparable{
	int id;
	String name;
	MyEmployee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		MyEmployee me =(MyEmployee) o;
		if(this.id < me.id) {
			return -1;
		}else if(this.id > me.id) {
			return 1;
		}else return 0;
		
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " : " + this.name;
	}
}
public class MyEmployeeDemo {

	public static void main(String[] args) {

		MyEmployee me1= new MyEmployee(8,"Varishta");
		MyEmployee me2 =new MyEmployee(3,"Menaka");
		MyEmployee me3 = new MyEmployee (2, "Beena");
		
		TreeSet<MyEmployee> ts = new TreeSet<MyEmployee>();
		ts.add(me1);
		ts.add(me2);
		ts.add(me3);
		
		
		System.out.println(ts);
	}

}
