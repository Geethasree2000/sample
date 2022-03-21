package com.capgemini.employeemanagementsystem;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.getSalary() > o2.getSalary()){
			return 1;
		}
		if(o1.getSalary() < o2.getSalary()){
			return -1;
		}else{
			return 0;
		}
	}
	

}
