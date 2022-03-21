package com.generics;

import java.util.LinkedList;

import java.util.Iterator;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// break the list to sublist
		System.out.println(list.subList(1, 3));// 3-1 = 2 elements is given as
												// output

		// adding the value at first location
		list.addFirst(01);

		// adding the value at the last
		list.addLast(100);

		// clear data
		// list.clear();

		// copy the value from
		// duplicate of list
		LinkedList list2 = (LinkedList) list.clone();

		// values are present in list or not
		list.contains(10);

		// return the head
		System.out.println(list.element());

		// System.out.println(list);
		// printing using java 8
		list.forEach(System.out::println);

		// get the first element
		list.getFirst();

		// get the last element
		list.getLast();

		// get using index
		list.get(4);

		// add the element at last tAIL
		list.offer(10);

		list.offerFirst(20);

		list.offerLast(30);

		// return the index of value
		list.indexOf(20);

		// check for list is empty or not
		list.isEmpty();

		// return the object of iterator class
		Iterator it = list.iterator();
		// it tell it has the next element or not
		while (it.hasNext()) {
			// it will give the value
			System.out.println("next " + it.next());
		}

		// return the head or forst value
		// it do not the first node
		list.peek();

		// return the head or first node

		// it will deleter the head also
		list.poll();

		list.peekFirst();
		list.peekLast();

		list.pollFirst();
		list.pollLast();

		// it will remove or first elemnt
		list.remove();
		list.remove(0);
		list.removeFirst();
		list.removeLast();

		// remove the matching element of list
		list.removeAll(list2);

		// it will print the size of list
		System.out.println(list.size());

		Object[] arr = list.toArray();

	}

}
