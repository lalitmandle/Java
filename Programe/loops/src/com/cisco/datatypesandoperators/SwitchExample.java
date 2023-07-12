package com.cisco.datatypesandoperators;

import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the choice.....");
		System.out.println("E - Even");
		System.out.println("O - Odd");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case'E':
		if(num % 2 == 0) {
			System.out.println("Even number");
		}
		break;
		case 'O':
		if(num%2 != 0) {
			System.out.println("Odd number");
		}
		break;
		default:
			System.out.println("No matching case found");
			break;
			
		}
	}

}
