package com.capgemini.employeemanagementsystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

//Comparable interface
public class EmployeeList  {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		String newdate = dateFormat.format(date);
		ArrayList<Employee> ls = new ArrayList<Employee>();
		Employee a = new Employee(1005, "geetha", 4343.33, newdate);
		Employee a1 = new Employee(103, "ram", 435443.33, newdate);
		Employee a2 = new Employee(1002, "sita", 45343.33, newdate);
		Employee a3 = new Employee(1001, "diya", 43443.33, newdate);

		ls.add(a);
		ls.add(a1);
		ls.add(a2);
		ls.add(a3);
		
		
		Collections.sort(ls);
		for (Employee e : ls) {
			System.out.println(e);
		}
		
	}
}
