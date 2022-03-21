package com.generics;

import java.util.Iterator;
import java.util.LinkedList;

class Student{
	private int rollno;
	private String name;
	private int classno;
	public Student(int rollno, String name, int classno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.classno = classno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassno() {
		return classno;
	}
	public void setClassno(int classno) {
		this.classno = classno;
	}
}
public class LinkedListRealTimePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"ram",3);
		Student s2 = new Student(2,"sita",4);
		Student s3 = new Student(5,"diya",10);
		
		LinkedList<Student> l = new LinkedList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println("rollno: "+s.getRollno()+", Studentname: "+s.getName()+", classno: "+s.getRollno());
		}
	}

}
