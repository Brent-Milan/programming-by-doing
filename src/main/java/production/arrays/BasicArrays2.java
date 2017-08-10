package production.arrays;

import java.util.Random;

public class BasicArrays2 {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int[] anArray = new int[10];
		
		
		for(int count = 0;  count < 10; count++) {
			int randomNum = 1 + r.nextInt(10);
			anArray[count] = randomNum;
		}
		
		
		for(int count = 0; count < anArray.length; count++) {
			System.out.println("Index " + count + " contains element " + anArray[count]);
		}
		
		
//		Testing random number construction		
//		for(int count = 0; count < 20; count++) {
//			int randomNum = 1 + r.nextInt(10);
//			System.out.println(randomNum);
//		}
		
		
		
	}
}
