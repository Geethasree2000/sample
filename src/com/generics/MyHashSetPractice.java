package com.generics;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(32);
		h.add(42);
		h.add(23);
		h.add(2);
		h.add(3);
		h.add(2);

		System.out.println(h.contains(2));
		System.out.println("----");
		System.out.println(h.isEmpty());
		System.out.println("----");
		System.out.println(h.remove(42));
		System.out.println("----");
		System.out.println(h.size());
		System.out.println("----");
		Iterator<Integer> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
