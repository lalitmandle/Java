//2) Write a program to calculate CGPA using marks of three subject(out of 100)

package com.cisco.p1;

public class Cgpa {

	public static void main(String[] args) {
		float subject1 = 65;
		float subject2 = 74;
		float subject3 = 92;
		float cgpa = (subject1+subject2+subject3)/30;
		System.out.println(cgpa);
	}

}
