package com.employeemanageuginglist;

import java.util.Comparator;

public class SortListByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
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
