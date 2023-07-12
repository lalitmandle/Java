package com.cisco.operators;

public class TypeCasting {

	public static void main(String[] args) {
		// implicit type conversion - converting lower size data type to higher size.

		int a = 30;
		float f = a;
		System.out.println(f);
		
		// explicit type conversion -  Converting higher size data type to lower size
		float val = 45.678f;
		int a1 = (int)val;
		System.out.println(a1);

	}

}
