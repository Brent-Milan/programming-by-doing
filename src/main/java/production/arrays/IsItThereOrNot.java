package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot {

	public static void main(String[] args) {
		
		int[] anArray = new int[10];
		
		Random r = new Random();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Array: ");
		
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(49);
			System.out.print(anArray[index] + "  ");
		}

		System.out.println("\n\nWhat number would you like to validate?");
		int userInput = input.nextInt();
		
		int count = 0;
		
		//increments count variable if a matching value is found
		for(int index = 0; index < anArray.length; index++) {
			if(anArray[index] == userInput) {
				count++;
			}
		}
		
		
		//determines whether a matching value was found in the previous for loop
		if(count > 0) {
			System.out.println("\n" + userInput + " is present in the array.");
		} else if(count == 0) {
			System.out.println("\nThe array does not contain " + userInput + "n");
		}
		
		
		
		
	}

}
