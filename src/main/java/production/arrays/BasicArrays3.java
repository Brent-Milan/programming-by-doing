package production.arrays;

import java.util.Random;

public class BasicArrays3 {

	public static void main(String[] args) {
		
			Random r = new Random();
			
			
			int[] anArray = new int[1000];
			
			for(int count = 0; count < anArray.length; count++) {
				int randomNum = 10 + r.nextInt(99);
				anArray[count] = randomNum;
				System.out.println(randomNum + "  ");
				
				
			}
			
			
	}

}
