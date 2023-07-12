package com.cisco.operators;

import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {
		float finalPrice = 0.0f;
		float discount = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of product");
		float cost = sc.nextFloat();
		System.out.println("Enter the type of the product V - Vegetables,G - Groceries");
		float productType = sc.next().charAt(0);
		if (cost >1500 || productType == 'V') {
			discount = (cost*10)/100;
			
		}else if (cost<1500 && cost>1000 || productType == 'G') {
			discount = (cost*5)/100;
			
		}else {
			discount = (cost *2)/100;
			
		}
		finalPrice = cost - discount;
		System.out.println("Price after discount = "+ finalPrice);

	}

}
