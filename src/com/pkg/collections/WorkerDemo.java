package com.pkg.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class WorkerDemo {

	public static void main(String[] args) {
		Worker w1=new Worker(343, "Nila");
		Worker w2=new Worker(234,"Akhila");
		Worker w3=new Worker(333,"Senthil");
		Worker w4=new Worker(776,"Amudhan");
		Worker w5=new Worker(646,"Rohinth");
		
		
		TreeSet ts =new TreeSet<Worker>(new WorkerComparator() );
		ts.add(w1);
		ts.add(w2);
		ts.add(w3);
		ts.add(w4);
		ts.add(w5);
		
		System.out.println(ts);
		

	}

}

class Worker{
	int id;
	String name;
	
	public Worker(int i, String s) {
		this.id=i;
		this.name=s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" : " + this.name;
	}
}

class WorkerComparator implements Comparator<Worker>{


	public int compare(Worker w1 , Worker w2) {
			
		return w1.name.compareTo(w2.name);
	}
	
}
