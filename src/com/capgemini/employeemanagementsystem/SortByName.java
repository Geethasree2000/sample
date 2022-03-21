package com.capgemini.employeemanagementsystem;

import java.util.Comparator;

public class SortByName implements Comparator<Employee1>{


	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if((o1.getName()).compareTo(o2.getName()) > 0){
			return 1;
		}
		if((o1.getName()).compareTo(o2.getName()) < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
