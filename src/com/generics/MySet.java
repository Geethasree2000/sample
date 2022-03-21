package com.generics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();

		// addiing data to set
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(5);
		set.add(10);// duplicate
		set.add(2);
		set.add(1);
		set.add(20);// duplicate
		System.out.println(set);

		// set.clear();
		set.contains(100);
		set.containsAll(set);
		set.isEmpty();
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// toString --.syso internally uses toString
		System.out.println(set.toString());

		set.remove(1);
		set.removeAll(set);
		set.size();
		set.toArray();
	}

}
