package com.cisco.arrays;
//import java.util.Scanner;
public class DuplicateArray {

	public static void main(String[] args) {
		//Initialize array
		int [] arr = new int [] {2,4,2,5,6,7,4};
		System.out.println("Duplicate elements in given arrays");
		// Searches for duplicate element
		for (int i = 0; i<arr.length;i++) {
			for (int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}

