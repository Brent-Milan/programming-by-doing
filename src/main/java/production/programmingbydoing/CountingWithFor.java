package production.programmingbydoing;

import java.util.Scanner;

public interface CountingWithFor {

	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a message and it will print five times: ");
		String message = input.nextLine();
		
		System.out.println("Message received: " + message);
		
		for(int count = 1; count <=5; count++) {
			System.out.println(count + "." + message);
		}
		
		for(int count = 1; count <= 10; count++) {
			System.out.println("The current count is " + count);
			
		}
		
		
		
		
		
	}
	
	
	
}
