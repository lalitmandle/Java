package com.cisco.p1;
import java.util.Scanner;
public class CalPercentage {

	public static void main(String[] args) {
		Scanner sub = new Scanner(System.in);
		System.out.println("Enter first subject number: ");
		int sub1 = sub.nextInt();
		System.out.println("Enter second subject Marks: ");
		int sub2 = sub.nextInt();
		System.out.println("Enter 3rd subject Mark: ");
		float sub3 = sub.nextFloat();
		System.out.println("Enter 4th subject Mark: ");
		float sub4 = sub.nextFloat();
		System.out.println("Enter 5th subject Mark: ");
		float sub5 = sub.nextFloat();
		//float sum =  sub1+sub2+sub3+sub4+sub5;
		float per =  ((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
		System.out.println(per);
		
	}

}
