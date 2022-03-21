package com.generics;

import java.util.Iterator;
import java.util.Stack;

class Car{
	private String brand;
	private double price;
	private String color;
	public Car(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
public class MyStackRealPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Benz",4000000,"black");
		Car c2 = new Car("audi",4345456,"red");
		Car c3 = new Car("ford",824355,"blue");
		
		Stack<Car> s = new Stack<Car>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		
		
		s.remove(0);
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Car c = (Car)it.next();
			System.out.println("Brand: "+c.getBrand()+", price: "+c.getPrice()+", color: "+c.getColor());
		}
	}

}
