package com.generics;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashStPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(3);
		l.add(2);
		l.add(10);
		l.add(34);

		System.out.println(l.contains(10));
		System.out.println("----");
		System.out.println(l.remove(10));
		System.out.println("----");
		System.out.println(l.isEmpty());
		System.out.println("----");
		System.out.println(l.size());
		System.out.println("----");
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
