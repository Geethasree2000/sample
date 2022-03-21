package com.generics;

import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vector is a thred set
		Vector<Integer> l = new Vector<Integer>();

		l.add(4);
		l.add(1);
		l.add(65);
		l.add(43);
		l.add(3);

		for (Object o : l) {
			System.out.println(o);
		}

		Vector<Integer> l1 = new Vector<Integer>();
		l1.add(2);
		l1.add(76);
		l1.add(54);

		l.addAll(l1);
		System.out.println("after merge-----");
		for (Object o : l) {
			System.out.println(o);
		}
		System.out.println(l.contains(1));
		System.out.println(l.indexOf(54));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.subList(2, 4));
		System.out.println(l.remove(1));
	}

}
