package production.arrays;

import java.lang.reflect.Array;

public class FindingTheLargestValue {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		int[] anArray = new int[10];
		
		for(int index = 10; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(99);
		}

	}

}
