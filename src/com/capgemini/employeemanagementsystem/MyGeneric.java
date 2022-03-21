package com.capgemini.employeemanagementsystem;

class EmployeeGeneric<T,Y>{
	//datatype is binded to class variable
	//tight coupling -->monitor and laptop are tight
	
	//loose coupling  -->pc and cpu are loose
	private T id;
	private Y name;

	public EmployeeGeneric(T id,Y name) {
		this.id = id;
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	public Y getName() {
		return name;
	}

	public void setName(Y name) {
		this.name =name;
	}
	public void print(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
	}
}

public class MyGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeGeneric<Integer,String> e = new EmployeeGeneric<Integer,String>(101,"geetha");
		e.print();
		
	
		
	}

}
