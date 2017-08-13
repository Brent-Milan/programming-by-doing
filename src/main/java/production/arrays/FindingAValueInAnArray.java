package production.arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindingAValueInAnArray {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		//populates intArray with random numbers
		for(int index = 0; index < intArray.length; index++) {
			intArray[index] = 1 + r.nextInt(49);
		}
		
		//prints out all elements within intArray to console
		System.out.println("Elements in the array are: ");
		
		for(int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index] + "  ");
		}
		
		//prompts user for search value and saves in variable
		System.out.println("\n\nWhich value would you like to validate? (1-50) ");
//		System.out.println("Please enter a number 1- 50. Enter '0' to exit.");
		int userInput = input.nextInt();
		
		boolean contains = IntStream.of(intArray).anyMatch(x -> x == userInput);
		System.out.println(contains);
		
			
	}

}
