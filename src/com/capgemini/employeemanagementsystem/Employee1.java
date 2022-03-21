package com.capgemini.employeemanagementsystem;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	private String doj;

	// default constructor
	public Employee1() {
	}

	// constructor with parameters
	public Employee1(int id, String name, double salary, String doj) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	// getter and setter
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

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	// toString method for printing
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
}
