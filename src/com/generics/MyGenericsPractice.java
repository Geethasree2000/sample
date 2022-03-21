package com.generics;

class CarGeneric<T, Y, Z> {
	private T brand;
	private Y price;
	private Z color;

	public CarGeneric(T brand, Y price, Z color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public T getBrand() {
		return brand;
	}

	public void setBrand(T brand) {
		this.brand = brand;
	}

	public Y getPrice() {
		return price;
	}

	public void setPrice(Y price) {
		this.price = price;
	}

	public Z getColor() {
		return color;
	}

	public void setColor(Z color) {
		this.color = color;
	}

	public void print() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Price: " + this.price);
		System.out.println("Color: " + this.color);
	}
}

public class MyGenericsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGeneric<String, Double, String> c = new CarGeneric<String, Double, String>("Benz", 1000000.0, "Black");
		c.print();
		
		CarGeneric<String, Integer, String> c1 = new CarGeneric<String, Integer, String>("Benz", 1000000, "Black");
		c1.print();
		
		CarGeneric<String, String, String> c2 = new CarGeneric<String, String, String>("Benz", "1000000.00", "Black");
		c2.print();
	}
}
