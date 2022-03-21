package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the list
		// ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList();
		// add data to list
		list.add("pyhon");
		list.add("c");
		list.add("java");
		list.add("perl");
		
		ArrayList<String> list1 = new ArrayList();
		// add data to list
		list1.add("c#");
		list1.add("c++");
		list1.add("sql");
		list1.add("tcl");

		// get the value using index
		System.out.println(list.get(0));
		// delete all elements for list
		// list.clear();

		// search for given item if found return true if not found return false
		System.out.println(list.contains("java"));
		// search element by index
		System.out.println(list.indexOf("java"));

		// delete the data froom index
		System.out.println(list.remove(0));
		for (String obj : list) {
			System.out.println(obj);
		}
		list.addAll(list1);
		for(Object a:list){
			System.out.println(a);
		}
		
		//sort list
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		ArrayList<Integer> i = new ArrayList();
		i.add(8);
		i.add(1);
		i.add(9);
		i.add(797);
		i.add(47);
		i.add(437);
		ArrayList<Integer> i1 = new ArrayList();
		i.add(832);
		i.add(132);
		i.add(932);
		i.add(7937);
		i.add(437);
		i.add(43237);
		
		i.addAll(i1);
		for(Object a:i){
			System.out.println(a);
		}
		
		//sort list
		Collections.sort(i);
		System.out.println(i);
		Collections.sort(i,Collections.reverseOrder());
		System.out.println(i);
	}

}
