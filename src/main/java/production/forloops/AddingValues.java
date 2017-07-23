package production.forloops;

import java.util.Scanner;

public class AddingValues {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int userInput = input.nextInt();
		
		
		int sum = 0;
		for(int count = 1; count <= userInput; count++) {
			System.out.println(count);
			sum = sum + count;
		}
			System.out.println("The sum is: " + sum);
	}

}
