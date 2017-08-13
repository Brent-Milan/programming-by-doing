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

	}

}
