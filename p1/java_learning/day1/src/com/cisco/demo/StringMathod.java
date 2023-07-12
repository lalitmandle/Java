package com.cisco.demo;

public class StringMathod {
	public static void main(String[] args) {
		String name = "java";
		String func = " is good language";
		System.out.println(name);
		System.out.println(name+func);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name+ " from\" "+ func);
		System.out.println(name+ " from\\ "+ func);
		System.out.println(name+ " from\t "+ func);
		System.out.println(name+ " form\n "+ func);
	}

}
