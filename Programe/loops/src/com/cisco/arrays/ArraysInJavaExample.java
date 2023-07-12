package com.cisco.arrays;

import java.util.Scanner;

public class ArraysInJavaExample {

	public static void main(String[] args) {
		// arrays declaration
		float marks[] = new float[6];
		//how to store the values
		marks[0] = 67;
		marks[1] = 68;
		marks[2] = 75;
		marks[3] = 98;
		marks[4] = 56;
		marks[5] = 86;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		
		
		//array declaration 
		float price[]= new float[6];
		//above code can be replaced using for loops and Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		for(int i = 0;i<price.length;i++) {
			price[i] = sc.nextFloat();
		}
		// print the values of the array using for loop
		System.out.println("Price .....");
		System.out.println("...........");
		for (int i = 0;i<price.length;i++) {
			System.out.println(price[i]);
		}
		

	}

}
