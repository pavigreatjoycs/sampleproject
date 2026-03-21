package com.pkg.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
	String name;
	int id;
	int marks;
	
	public Student() {
		
	}
	
	public Student(String name, int id, int marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.id-s.id;
	}
	
}


public class StudentList {

	public static void main(String[] args) {

		Student s1= new Student("Archana", 2, 38);
		Student s2= new Student("Maria", 1, 98);
		Student s3= new Student("Nancy", 7, 77);
		Student s4=new Student("Kavya",5,85);
		
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		
		Collections.sort(studList);
		for(Student s:studList) {
			System.out.println(s);
		}
	}

}
