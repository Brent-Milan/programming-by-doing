package production.arrays;

import java.util.Random;
import java.util.Scanner;

public class GradesInArrayAndFile {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		Scanner input = new Scanner(System.in);
		
		int[] gradesInArray = new int[5];
		
		for(int index = 0; index < 5; index++) {
			int randomNum = 1 + r.nextInt(99);
			gradesInArray[index] = randomNum;
		}

	}

}
