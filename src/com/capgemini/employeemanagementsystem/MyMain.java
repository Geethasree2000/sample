package com.capgemini.employeemanagementsystem;

public class MyMain {
	
	//search
	//sort asc and dec without function
	//find largest number in array
	//find smallest number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50, 3, 5 };
		// find the largest of these number

		// largest number as zero
		int num = 0;

		// iterate the array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[i]) {//ascending
					//if(a[j] > a[[i])//descending
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		// System.out.println(num);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
