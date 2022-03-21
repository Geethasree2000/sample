package com.comaprableinterface;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		Student s1 = new Student(101,"gita",2);
		Student s2 = new Student(107,"sita",4);
		Student s3 = new Student(102,"rita",1);
		Student s4 = new Student(109,"nita",6);
		
		List<Student> l = new LinkedList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		Collections.sort(l);
		//reverse order
		//Collections.sort(l,Collections.reverseOrder());
		for(Student s: l){
			System.out.println(s);
		}
	}
}
