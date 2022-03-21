package com.wrapperclasses;

public class MyWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using wrapper classes we can convert from one datatype to other
		int num = 10;

		Integer num2 = new Integer(num);
		Byte b = num2.byteValue();
		System.out.println(b);

		String str = "10";

		// parseint use to convert sttring value to int
		Integer num3 = Integer.parseInt(str);
		int num4 = num3 + num2;

		double d = num2.doubleValue();
		String str1 = num2.toString();

		Float f = new Float(d);
		f.byteValue();
		f.doubleValue();
		f.compareTo(f);
		f.intValue();
		f.longValue();
		f.shortValue();
		System.out.println(f.MAX_VALUE);
		System.out.println(f.MIN_VALUE);
	}

}
