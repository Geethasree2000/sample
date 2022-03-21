package com.employeemanageuginglist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();

		int counter = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Edit Employee ");
			System.out.println("Press 3 for Delete Employee ");
			System.out.println("Press 4 for Update Employee ");
			System.out.println("Press 5 for Print Sort the Salary of Employee ");
			System.out.println("Press 6 for Print Sort the Name of Employee ");
			System.out.println("Press 7 for Print Sort by ID ");
			System.out.println("press 8 for Searching Employee by ID ");
			System.out.println("press 9 for Searching Employee by Name ");
			System.out.println("press 10 for display the list");
			System.out.println("Press 11 exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the employee name");
				String name = sc.next();

				// System.out.println("choice "+choice);
				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				// taking the current date starts

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();

				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list.add(employee);
				counter = counter + 1;
				break;
			case 2:
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						System.err.println("press " + count + " " + e);
					}
					count = count + 1;
				}
				int editChoice = sc.nextInt();
				System.out.println("press one for update name");
				System.out.println("press two for update salary");
				System.out.println("press three for update id");

				Employee object = list.get(editChoice);

				String name1 = object.getName();
				double salary1 = object.getSalary();
				int id1 = object.getId();
				int editOption = sc.nextInt();

				if (editOption == 1) {
					System.out.println("enter new name");
					list.get(editChoice).setName(sc.next());
				} else if (editOption == 2) {
					System.out.println("enter new Salary");
					list.get(editChoice).setSalary(sc.nextDouble());
				} else if (editOption == 3) {
					System.out.println("enter new id");
					list.get(editChoice).setId(sc.nextInt());
				} else {
					System.err.println("wrong update choice");
				}
				break;
			case 3:
				int count1 = 0;
				System.out.println("delete the employee of your choice");
				for (Employee e : list) {
					if (e != null) {
						System.err.println("press " + count1 + " " + e);
					}
					count1 = count1 + 1;
				}
				int deleteChoice = sc.nextInt();

				list.remove(deleteChoice);
				break;
			case 4:
				System.out.println("updated list");
				for (Employee e : list) {
					if (e != null) {
						System.err.println(e);
					}
				}
				break;
			case 5:
				Collections.sort(list, new SortBySalary());
				for (Employee e : list) {
					System.out.println(e);
				}
				break;
			case 6:
				Collections.sort(list, new SortListByName());
				for (Employee e : list) {
					System.out.println(e);
				}
				break;
			case 7:
				Collections.sort(list, new SortById());
				for (Employee e : list) {
					System.out.println(e);
				}
				break;
			case 8:
				System.out.println("enter the employee id to be searched");
				int searchId = sc.nextInt();
				for (Employee e : list) {
					if (e.getId() == searchId) {
						System.out.println(e);
						break;
					} else {
						System.out.println("the id you have searched is not in the list");
						break;
					}
				}
				break;
			case 9:
				System.out.println("enter the name to be searched");
				String searchName = sc.next();
				for (Employee e : list) {
					if (e.getName().compareTo(searchName) == 0) {
						System.out.println(e);
						break;
					} else {
						System.out.println("the name you have searched is not in the list");
						break;
					}
				}
				break;
			case 10:
				for (Employee e : list) {
					System.out.println(e);
				}
			case 11:
				break;
			}
		}
	}

}
