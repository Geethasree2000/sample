package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class MyArrayListRealTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"sia",34343.4);
		Employee e2 = new Employee(2,"ram",43423.3);
		Employee e3 = new Employee(3,"raj",32324.3);
		Employee e4 = new Employee(4,"diya",34332.3);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee)it.next();
			System.out.println("empId: "+emp.getId()+", EmpName: "+emp.getName()+", Salary: "+emp.getSalary());
		}
		
	}

}
