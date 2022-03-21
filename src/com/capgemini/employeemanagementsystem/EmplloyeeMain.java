package com.capgemini.employeemanagementsystem;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmplloyeeMain {

	public static void main(String[] args) {

		Employee list[] = new Employee[10];

		int counter = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Edit Employee ");
			System.out.println("Press 3 for Print maximum Salary Employee ");
			System.out.println("Press 4 for Print minimum Salary Employee ");
			System.out.println("Press 5 for Print Sort the Salary of Employee ");
			System.out.println("Press 6 for Print Sort the Name of Employee ");
			System.out.println("Press 7 exit");
			System.out.println("Press 8 for Display the List");
			int choice = sc.nextInt();

			if (choice == 1) {

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
				list[counter] = employee;
				counter = counter + 1;
			} else if (choice == 2) {
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

				// taking the update object data
				Employee object = list[editChoice];

				String name = object.getName();
				double salary = object.getSalary();
				int id = object.getId();
				int editOption = sc.nextInt();

				if (editOption == 1) {
					System.out.println("enter new name");
					list[editChoice].setName(sc.next());
				} else if (editOption == 2) {
					System.out.println("enter new Salary");
					list[editChoice].setSalary(sc.nextDouble());
				} else if (editOption == 3) {
					System.out.println("enter new id");
					list[editChoice].setId(sc.nextInt());
				} else {
					System.err.println("wrong update choice");
				}
			} else if (choice == 3) {
				double maximum = list[0].getSalary();
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						if (e.getSalary() > maximum) {
							maximum = e.getSalary();
						}

					}
					count = count + 1;
				}
				System.out.println(maximum);
			} else if (choice == 4) {
				double minimum = list[0].getSalary();
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						if (e.getSalary() < minimum) {
							minimum = e.getSalary();
						}

					}
					count = count + 1;
				}
				System.out.println(minimum);
			} else if (choice == 5) {
				double sal[] = new double[list.length];

				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						sal[i] = list[i].getSalary();
					}
				}
				double temp = 0;
				for (int i = 0; i < sal.length; i++) {
					for (int j = 0; j < sal.length; j++) {
						if (sal[j] > sal[i]) {// descending
							temp = sal[i];
							sal[i] = sal[j];
							sal[j] = temp;
						}
					}

				}
				for (int i = 0; i < sal.length; i++) {
					if (sal[i] != 0)
						System.out.println(sal[i]);
				}
			} else if (choice == 6) {
				String na[] = new String[list.length];

				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						na[i] = list[i].getName();
					}
				}

				for (int i = 0; i < na.length; i++) {
					for (int j = 0; j < na.length; j++) {
						if (na[i] != null && na[j] != null) {
							if (na[i].compareTo(na[j]) < 0) {
								String temp = na[i];
								na[i] = na[j];
								na[j] = temp;
							}
						}
					}

				}
				for (int i = 0; i < na.length; i++) {
					if (na[i] != null)
						System.out.println(na[i]);
				}
			} else if (choice == 7) {
				break;
			} else if (choice == 8) {
				for (Employee e : list) {
					if (e != null)
						System.out.println(e);
				}
			} else {
				System.out.println("Wrong choice try again");
			}
		}
	}
}
