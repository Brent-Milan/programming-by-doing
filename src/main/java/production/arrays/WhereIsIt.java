package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		int[] anArray = new int[10];
		
		System.out.print("Array: ");
		
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(49);
			System.out.print(anArray[index] + "  ");
		}

		
		System.out.println("\n\nWhich number would you like to validate?");
		int userInput = input.nextInt();
		
		int count = 0;
		for(int index = 0; index < anArray.length; index++) {
			if(userInput == anArray[index]) {
				System.out.println("Found " + userInput + " at index " + index);
				count++;
			}
			
		}
		
		
		
		System.out.println("Your number was found " + count + "time(s).");
		
	}

}
