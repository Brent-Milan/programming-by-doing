package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		
		int[] anArray = new int[10];
		
		System.out.print("Array: ");
		
		//populates array with random numbers + prints out array elements
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(49);
			System.out.print(anArray[index] + "  ");
		}
		
		System.out.println("\nWhich number would you like to check the frequency of?");
		int userInput = input.nextInt();
		
		
		
		

	}

}
