package com.generics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList();
		l.add(32);
		l.add(43);
		l.add(65);
		l.add(55);
		l.add(35);
		l.add(21);
		l.add(87);

		l.addFirst(76);
		l.addLast(100);
		for (Object i : l) {
			System.out.println(i);
		}
		System.out.println("-----------");
		System.out.println(l.contains(32));
		System.out.println("-----------");
		System.out.println(l.element());
		LinkedList l2 = (LinkedList) l.clone();
		System.out.println("-----------");
		l2.forEach(System.out::println);
		System.out.println("-----------");
		System.out.println(l.get(3));
		System.out.println("-----------");
		System.out.println(l.getFirst());
		System.out.println("-----------");
		System.out.println(l.getLast());
		System.out.println("-----------");
		l.offer(32);
		l.offerFirst(25);
		l.offerLast(65);
		l.forEach(System.out::println);
		System.out.println("-----------");
		System.out.println(l.isEmpty());
		System.out.println("-----------");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println("next " + it.next());
		}
		System.out.println("-----------");
		System.out.println(l.peek());
		System.out.println("-----------");
		System.out.println(l.peekFirst());
		System.out.println("-----------");
		System.out.println(l.peekLast());
		System.out.println("-----------");
		System.out.println(l.poll());
		System.out.println("-----------");
		System.out.println(l.pollFirst());
		System.out.println("-----------");
		System.out.println(l.pollLast());
	}
}
