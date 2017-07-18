package production.programmingbydoing;

import java.util.Scanner;

public class CountingMachineRevisisted {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		int userInput = input.nextInt();
		
		System.out.println("Give me another number: ");
		int userInput2 = input.nextInt();
		
		System.out.println("Give me a final number: ");
		int userInput3 = input.nextInt();
		
		System.out.println("Count from: " + userInput);
		System.out.println("Count to: " + userInput2);
		System.out.println("Count by: " + userInput3 + "\n");
		
		for(int count = userInput; count <= userInput2; count = count + userInput3) {
			System.out.println(count);
		} 

	}

}
