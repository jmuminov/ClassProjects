package com.syntax.class01;

public class JavaClass01Homework {

	public static void main(String[] args) {
		byte myByteNum = 100;
		short myShortNum = 10000;
		int myIntNum = 1000000000;
		long myLongNum = 1000000000000000000l;
		
		float myFloatNum = 10.9522559f;
		double myDoubleNum = 111.9964556456456;
		
		char myChar = 'A';
		char mySpecialChar = '$';

		boolean myTBoolean = true;
		boolean myFBoolean = false;

		System.out.println("My Byte value = " + myByteNum);
		System.out.println("My Short value = " + myShortNum);
		System.out.println("My Int value = " + myIntNum);
		System.out.println("My Long value = " + myLongNum);
		System.out.println("My Float value = " + myFloatNum);
		System.out.println("My Double value = " + myDoubleNum);
		System.out.println("My Char value = " + myChar);
		System.out.println("My Special Char value = " + mySpecialChar);
		System.out.println("My True Boolean value = " + myTBoolean);
		System.out.println("My False Boolean value = " + myFBoolean);
		
		myByteNum = 101;
		myShortNum = 10001;
		myIntNum = 1000000001;
		myLongNum = 1000000000000000001l;
		
		myFloatNum = 11.9522559f;
		myDoubleNum = 112.9964556456456;
		
		myChar = 'B';
		mySpecialChar = '%';
		
		myTBoolean = false;
		myFBoolean = true;
		
		System.out.println("My New Byte value = " + myByteNum);
		System.out.println("My New Short value = " + myShortNum);
		System.out.println("My New Int value = " + myIntNum);
		System.out.println("My New Long value = " + myLongNum);
		System.out.println("My New Float value = " + myFloatNum);
		System.out.println("My New Double value = " + myDoubleNum);
		System.out.println("My New Char value = " + myChar);
		System.out.println("My New Special Char value = " + mySpecialChar);
		System.out.println("My New True Boolean value = " + myTBoolean);
		System.out.println("My New False Boolean value = " + myFBoolean);

	}

}
