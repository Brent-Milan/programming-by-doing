package production.arrays;

import java.util.Random;

public class FindingAValueInAnArray {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] intArray = new int[10];
		
		for(int index = 0; index < intArray.length; index++) {
			intArray[index] = 1 + r.nextInt(49);
		}
		
		
		
		

	}

}
