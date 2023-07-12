package com.cisco.operators;

import java.util.Scanner;

// This is the calculate the discount of any product 

public class LogicalOperators {

	public static void main(String[] args) {
		float finalPrice = 0.0f;
		float discount = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the product");
		float cost = sc.nextFloat();
		if(cost>1500) {
			discount = (cost*10)/100;
		}else if(cost<1500 && cost>1000) {
			discount = (cost * 5)/100;
		}else {
			discount = (cost*2)/100;
		}
		finalPrice = cost - discount;
		System.out.println("Price after discount = " + finalPrice);

	}

}
