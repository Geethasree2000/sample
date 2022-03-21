package com.capgemini.employeemanagementsystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


//Comparator interface by using sortbyId
public class EmpployeeList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		String newdate = dateFormat.format(date);
		ArrayList<Employee1> ls = new ArrayList<Employee1>();
		Employee1 a = new Employee1(1005, "geetha", 4343.33, newdate);
		Employee1 a1 = new Employee1(103, "ram", 435443.33, newdate);
		Employee1 a2 = new Employee1(1002, "sita", 45343.33, newdate);
		Employee1 a3 = new Employee1(1001, "diya", 43443.33, newdate);

		ls.add(a);
		ls.add(a1);
		ls.add(a2);
		ls.add(a3);
		
		Collections.sort(ls,new SortById());
		Collections.sort(ls,new SortByName());
		Collections.sort(ls,new SortBySalary());
		for (Employee1 e : ls) {
			System.out.println(e);
		}
		

	}

}
