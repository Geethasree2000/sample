package com.capgemini.employeemanagementsystem;

import java.util.Comparator;

//In comparable we write the soting logic in the model itself
//Comparator->we will implement the comparator
//we will create different class for key
// we will receive 2 object a time
public class SortById implements Comparator<Employee1>{


	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		if(o1.getId() > o2.getId()){
			return 1;
		}
		if(o1.getId() < o2.getId()){
			return -1;
		}else{
			return 0;
		}
	}

	
}
