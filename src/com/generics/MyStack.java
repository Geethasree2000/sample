package com.generics;

import java.util.Stack;
import java.util.Vector;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();

		st.add(3);
		st.add(545);
		st.add(43);
		st.add(76);
		st.add(45);

		st.push(54);
		st.push(756);
		st.push(44);
		st.push(21);

		for (Object o : st) {
			System.out.println(o);
		}
		System.out.println("After pop--------");
		st.pop();
		st.pop();
		st.pop();
		for (Object o : st) {
			System.out.println(o);
		}

		Stack<Integer> s = new Stack<Integer>();
		s.add(34);
		s.add(33);
		st.addAll(s);
		System.out.println("After mergeing stacks--------");
		for (Object o : st) {
			System.out.println(o);
		}

		System.out.println(st.contains(34));
		System.out.println(st.indexOf(34));
		System.out.println(st.isEmpty());
		System.out.println(st.subList(0, 2));
		System.out.println(st.remove(3));

	}

}
