package production.arrays;

import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] lastNames = { "Kennedy", "Obama", "Clinton", "Lincoln", "Truman" };
		
		double[] grades = { 80.00, 85.00, 70.00, 90.00, 75.00  };
		
		int[] studentId = { 23, 44, 10, 88, 50 };
		
		System.out.println("Student last names: ");
		toString(lastNames);
		
		System.out.println("\n\nStudent grades: ");
		toString(grades);
		
		System.out.println("\n\nStudent IDs: ");
		toString(studentId);
		
		System.out.println("\nPlease enter in the student ID number below: ");
		int userInput = input.nextInt();
		
		
		
		
		

	} //end main

	
	public static void toString(int[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
	
	public static void toString(String[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	

	public static void toString(double[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
	public static void indexReturn(int[] array, int userInput) {
		for(int index = 0; index < array.length; index++) {
			int count = 0;
			if(userInput == array[index]) {
				System.out.println(array[index]);
				return count;
			}
			count++;
		}
	}
	
	
}
