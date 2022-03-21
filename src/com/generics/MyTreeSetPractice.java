package com.generics;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(2);
		t.add(54);
		t.add(76);
		t.add(3);
		t.add(10);

		System.out.println("----");
		System.out.println(t.contains(10));
		System.out.println("----");
		System.out.println(t.remove(10));
		System.out.println("----");
		System.out.println(t.isEmpty());
		System.out.println("----");
		System.out.println(t.clone());
		System.out.println("----");
		System.out.println(t.size());
		System.out.println("----");
		System.out.println(t.toString());
		System.out.println("----");
		System.out.println(t.descendingSet());
		System.out.println("----");
		Iterator<Integer> i = t.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----");
		Iterator<Integer> i1 = t.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
