package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> i = new ArrayList();

		i.add(8);
		i.add(1);
		i.add(9);
		i.add(797);
		i.add(47);
		i.add(437);

		// element in an index
		System.out.println(i.indexOf(47));
		System.out.println("-----------------");
		// delete an element by index value
		System.out.println(i.remove(3));
		System.out.println("-----------------");
		// search element by giving value
		System.out.println(i.contains(47));
		System.out.println("-----------------");
		// search element by index
		System.out.println(i.get(4));
		System.out.println("-----------------");
		// delete all elements
		// i.clear();
		// print all elements
		for (Object a : i) {
			System.out.println(a);
		}

		ArrayList<Integer> i1 = new ArrayList();
		i.add(832);
		i.add(132);
		i.add(932);
		i.add(7937);
		i.add(437);
		i.add(43237);

		i.addAll(i1);
		for (Object a : i) {
			System.out.println(a);
		}

		// sort list
		Collections.sort(i);
		System.out.println(i);
		Collections.sort(i, Collections.reverseOrder());
		System.out.println(i);

		ArrayList j = new ArrayList();

		j.add(890.0);
		j.add(1);
		j.add("java");
		j.add(797);
		j.add(47);
		j.add("hello");

		// element in an index
		System.out.println(j.indexOf(47));
		System.out.println("-----------------");
		// delete an element by index value
		System.out.println(j.remove(3));
		System.out.println("-----------------");
		// search element by giving value
		System.out.println(j.contains(47));
		System.out.println("-----------------");
		// search element by index
		System.out.println(j.get(4));
		System.out.println("-----------------");
		// delete all elements
		// i.clear();
		// print all elements
		for (Object b : j) {
			System.out.println(b);
		}

	}

}
