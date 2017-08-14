package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		int[] anArray = int[10];
		
		for(int index = 0; index < anArray.length; index++) {
			anArray[index] = 1 + r.nextInt(49);
		}

	}

}
