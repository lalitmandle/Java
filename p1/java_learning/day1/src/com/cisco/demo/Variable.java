package com.cisco.demo;

public class Variable {
	public static void main(String[] args) {
		//write your code here 
		System.out.println("Hello World");
		/* Variables
		  Water- Bucket
		  Masala - box
		  Lunch - LunchBox
		  In Java: 
		  Variables are containers which store data values
		  String, int, float,char, boolean
		  How to declare variable :
		  syntax - <dataType> <variablesname> = <values>;
		 */
		String name = "Harsa";
		System.out.println(name);
		int a = 45,x = 34,y = 78;
		float b = 45.5f;
		boolean isAdult = false;
		System.out.println(a);
		System.out.println(b);
		System.out.println(isAdult);
	/* Rules for constructing name of variables in java 
		1. can contain digits, underscore , dollar signs, letters
		2. should begin with a letter, $ or _
		3. java is case sensitive language which means that 
		   Ankit and ankit are two different variable 
		4. should not contain whitespace
		5. You cannot use reserved keywords from Java 
		*/
		/*Two types of java Data type
		 * 1. primitive - byte(1 byte),short (2 bytes),int(4bytes),long(8 bytes),float(4 bytes)
		      double(8bytes), boolean (1 bit), char(2bytes)
		   2. Non primitive or Reference Data Type- 
		 */
		byte u = 56;
		double d = 684.45d;
		char grade = 'A';
		System.out.println(d);
		System.out.println(u);
		System.out.println(grade);
	}

}
