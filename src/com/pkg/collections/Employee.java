package com.pkg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		Employee e1=new Employee(22,"Eshwar", 8000);
		Employee e2=new Employee(43,"Mahesh", 7000);
		Employee e3=new Employee(33,"Mahadev", 5000);
		
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		Collections.sort(elist);
		
		for(Employee e:elist) {
			System.out.println(e);
		}

	}


	@Override
	public int compareTo(Employee e) {
//		return e.name.compareTo(this.name);
		return this.name.compareTo(e.name);
	}

}
