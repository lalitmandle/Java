// Print given number is even or odd
package com.cisco.datatypesandoperators;

import java.util.Scanner;

public class OddEvan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}

	}

}
