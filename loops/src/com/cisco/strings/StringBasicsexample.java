package com.cisco.strings;
import java.util.Scanner;
public class StringBasicsexample {
	public static void main(String[] args) {
		String s = new String();   // this will create an empty string
		s = "LALIT";
		String str = "This is new String";//String variable
		String str2 = new String("This is String in Java");
		
		char word[] = {'S','t','r','i','n','g'};
		String str1 = new String(word);
		System.out.println(s);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str1);
		
		//How to read string using keyboard 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name of the student");
		String studentName = sc.next();
		System.out.println("Student Name =" +studentName);
		
		System.out.println("enter the name of the employee");
		sc.nextLine();
		String empName = sc.nextLine();
		System.out.println("Employee Name = " + empName);
		
			
	}

}
