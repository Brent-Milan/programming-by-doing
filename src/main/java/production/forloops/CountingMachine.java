package production.forloops;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me an integer to count to: ");
		int number = input.nextInt();
		
		System.out.println("Count to : " + number);
		
		for(int count = 0; count <= number; count++) {
			System.out.println(count);
		}

	}

}
