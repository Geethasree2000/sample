package com.generics;

import java.util.Iterator;
import java.util.Vector;

class Flower {
	private String name;
	private String color;

	public Flower(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;

	}
}

public class MyVectorRealTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f1 = new Flower("Rose","Red");
		Flower f2 = new Flower("sunflower","yellow");
		Flower f3 = new Flower("lily","white");
		
		Vector<Flower> v = new Vector<Flower>();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Flower f = (Flower)it.next();
			System.out.println("Name "+f.getName()+", color: "+f.getColor());
		}
	}
}
