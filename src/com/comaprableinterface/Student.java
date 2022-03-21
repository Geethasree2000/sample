package com.comaprableinterface;

public class Student implements Comparable<Student>{
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
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", classno=" + classno + "]";
	}
	/*public int compareTo(Student s){
		if((this.getName()).compareTo(s.getName()) >0){
			return 1;
		}
		if((this.getName()).compareTo(s.getName()) <0){
			return -1;
		}else{
			return 0;
		}
	}*/
	/*public int compareTo(Student s){
		if(this.getRollno() > s.getRollno()){
			return 1;
		}
		if(this.getRollno() < s.getRollno()){
			return -1;
		}else{
			return 0;
		}
	}*/
	public int compareTo(Student s){
		if(this.getClassno() > s.getClassno()){
			return 1;
		}
		if(this.getClassno() < s.getClassno()){
			return -1;
		}else{
			return 0;
		}
	}
}
