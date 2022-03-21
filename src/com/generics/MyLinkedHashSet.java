package com.generics;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedHashSet
		// maintain the insertion order
		// it does not hold the duplicate value

		// LinkedHahSet<Integer> = new LinkedHashSet<Integer>();
		// TreeSet can be used to sort set in ascending and descending
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(8);
		set.add(15);

		// add or merge 2 setss
		set.addAll(set);

		// clear set
		// set.clear();

		set.contains(10);

		set.isEmpty();
		set.iterator();
		// set.remove(10);
		set.size();

		// sort in desecnding order --> tree set
		Iterator<Integer> i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(set);
	}

}
