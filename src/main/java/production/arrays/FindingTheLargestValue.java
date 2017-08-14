package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingTheLargestValue {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		int[] anArray = new int[10];
		
		System.out.print("Array: ");
		
		//populates array and prints to console
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(99);
			System.out.print(anArray[index] + "  ");
		}

		
		int theOne = 0;
		
		//compares each element to a variable. 
		//variable is set to higher and higher values until highest is found
		for(int index = 0; index < anArray.length; index++) {
			if(anArray[index] > theOne) {
				theOne = anArray[index];
			}
		}
	
		System.out.println("\nThe largest value in the array is " + theOne);
		
		
	}  //end main

}
