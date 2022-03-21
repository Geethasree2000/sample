package com.wrapperclasses;

public class WrapperClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		Integer num1 = new Integer(num);
		System.out.println(num1.doubleValue());
		System.out.println(num1.floatValue());
		System.out.println(num1.longValue());
		System.out.println(num1.toString());
		System.out.println(num1.toBinaryString(num));
		System.out.println(num1.compareTo(num));
		System.out.println(num1.MAX_VALUE);
		System.out.println(num1.MIN_VALUE);
		String s = "10";
		System.out.println(num1.parseInt(s));
		System.out.println("-----------");
		float f = 10.0f;
		Float f1 = new Float(f);
		System.out.println(f1.compareTo(f));
		System.out.println(f1.doubleValue());
		System.out.println(f1.intValue());
		System.out.println(f1.toString());
		System.out.println(f1.byteValue());
		System.out.println(f1.shortValue());
		System.out.println(f1.MAX_VALUE);
		System.out.println(f1.MIN_VALUE);
		System.out.println(f1.toString(f));
		System.out.println(f1.toHexString(f));
		System.out.println("-----------");
		double d = 10.0;
		Double d1 = new Double(d);
		System.out.println(d1.compareTo(d));
		System.out.println(d1.doubleValue());
		System.out.println(d1.floatValue());
		System.out.println(d1.intValue());
		System.out.println(d1.longValue());
		System.out.println(d1.byteValue());
		System.out.println(d1.shortValue());
		System.out.println(d1.MAX_VALUE);
		System.out.println(d1.MIN_VALUE);
		System.out.println(d1.toString(d));
		System.out.println("-----------");
		char c = 'a';
		Character c1 = new Character(c);
		System.out.println(c1.charValue());
		System.out.println(c1.compareTo(c1));
		System.out.println(c1.toString());
		// System.out.println(c1.MAX_VALUE);
		// System.out.println(c1.MIN_VALUE);
		System.out.println(c1.getType(c));
		System.out.println(c1.isDigit(c));
		System.out.println(c1.toUpperCase(c));
		System.out.println(c1.toLowerCase(c));
		System.out.println("-----------");
		boolean b = true;
		boolean a = false;
		Boolean b1 = new Boolean(b);
		Boolean a1 = new Boolean(a);
		System.out.println(b1.booleanValue());
		System.out.println(b1.compareTo(b));
		System.out.println(b1.toString());
		System.out.println(b1.getBoolean(s));
		System.out.println(b1.logicalAnd(a1, b1));
		System.out.println(b1.logicalOr(a1, b1));
		System.out.println(b1.logicalXor(a1, b1));
		System.out.println(b1.parseBoolean(s));
		System.out.println(b1.toString(b));
		System.out.println(b1.valueOf(b));
		System.out.println(b1.FALSE);
		System.out.println(b1.TRUE);
		System.out.println("-----------");
		byte z = 10;
		Byte z1 = new Byte(z);
		System.out.println(z1.compareTo(z1));
		System.out.println(z1.doubleValue());
		System.out.println(z1.floatValue());
		System.out.println(z1.intValue());
		System.out.println(z1.longValue());
		System.out.println(z1.toString());
		System.out.println(z1.byteValue());
		System.out.println(z1.shortValue());
		System.out.println(z1.BYTES);
		System.out.println(z1.SIZE);
		System.out.println(z1.MAX_VALUE);
		System.out.println(z1.MIN_VALUE);
		System.out.println(z1.toUnsignedInt(z));
		System.out.println(z1.toUnsignedLong(z));
		System.out.println(z1.valueOf(z));
		System.out.println(z1.parseByte(s));
	}

}
