package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingLargestValueLocation {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner input = new Scanner(System.in);
		
		int[] anArray = new int[10];
		
		int theOne = 0;
		
		//populates the array and prints out elements to console
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(99);
			System.out.print(anArray[index] + "  ");
			
			if(anArray[index] > theOne) {
				theOne = anArray[index];
			}
		}

		//iterates over array again to find index location of highest value and print to console
		for(int index = 0; index < anArray.length; index++) {
			if(anArray[index] == theOne) {
				System.out.println("A highest value element is located at index " + index);
			}
		}
		
		
		
		
	}

}
