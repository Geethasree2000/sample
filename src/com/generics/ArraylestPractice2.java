package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylestPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animal = new ArrayList();
		animal.add("lion");
		animal.add("tiger");
		animal.add("cheetah");
		animal.add("leapord");
		animal.add("blackpanther");
		
		for(Object a:animal){
			System.out.println(a);
		}
		
		ArrayList<String> animal1 = new ArrayList();
		animal1.add("polar bear");
		animal1.add("bear");
		animal1.add("koala bear");
		animal1.add("panda");
		animal.addAll(animal1);
		
		Collections.sort(animal);
		System.out.println(animal);
		Collections.sort(animal,Collections.reverseOrder());
		System.out.println(animal);
		
		animal.clear();
		
	}

}
