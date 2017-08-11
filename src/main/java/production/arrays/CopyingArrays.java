package production.arrays;

import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arrayOne = new int[10];
		int[] arrayTwo = new int[10];
		
		System.out.println("arrayOne contains the following elements:");
		for(int index = 0; index < 10; index++) {
			int randomNum = 1 + r.nextInt(99);
			arrayOne[index] = randomNum;
			System.out.print(arrayOne[index] + "  ");
		}

		
		//ArrayOne copied to ArrayTwo
		System.arraycopy(arrayOne, 0, arrayTwo, 0, 10);
		
		//Testing whether copy occurred
		System.out.println("\narrayTwo contains the following elements: ");
		for(int index = 0; index < arrayTwo.length; index++) {
			System.out.print(arrayTwo[index] + "  ");
		}
		
		
	}

}
