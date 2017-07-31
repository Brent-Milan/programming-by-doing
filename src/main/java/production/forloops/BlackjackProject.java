package production.forloops;

import java.util.Random;
import java.util.Scanner;

public class BlackjackProject {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the definitive Blackjack Simulator.\n");
		
		int userFirstCard = 2 + r.nextInt(11);
		int userSecondCard = 2 + r.nextInt(11);
		
		int FirstAndSecondSum = userFirstCard + userSecondCard;
		
		int dealerFirstCard = 2 + r.nextInt(11);
		int dealerSecondCard = 2 + r.nextInt(11);
		
		int FirstAndSecondSumDealer = dealerFirstCard + dealerSecondCard;
		
		System.out.println("Your cards are " + userFirstCard + "and " + userSecondCard);
		System.out.println("Your total is " + FirstAndSecondSum + ".\n");
		
		System.out.println("The dealers cards are " + dealerFirstCard + " and another hidden card.\n");
		System.out.println("The dealer total is also hidden.");
		
		System.out.println("Would you like to hit or stay?\n");
		String userInput = input.next();
		
		if(userInput.equalsIgnoreCase("hit")) {
			
			int newTotal = 0;
			do {
				int userNewCard = 2 + r.nextInt(11);
				System.out.println("Your new card is " + userNewCard);
				newTotal = FirstAndSecondSum + userNewCard;
				System.out.println("Your new total is " + newTotal);
			} while(newTotal < 21);
			
		}
		
		

	}

}
