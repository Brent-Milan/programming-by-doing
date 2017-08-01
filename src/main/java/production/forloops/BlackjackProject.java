package production.forloops;

import java.util.Random;
import java.util.Scanner;

public class BlackjackProject {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the definitive Blackjack Simulator.\n");
		
		//player cards
		int userFirstCard = 2 + r.nextInt(11);
		int userSecondCard = 2 + r.nextInt(11);
		int userCardSum = userFirstCard + userSecondCard;
		
		//dealer cards
		int dealerFirstCard = 2 + r.nextInt(11);
		int dealerSecondCard = 2 + r.nextInt(11);
		int dealerCardSum = dealerFirstCard + dealerSecondCard;
		
		//win booleans
		boolean userWin = false;
		boolean dealerWin = false;
		
		
		System.out.println("Your cards are " + userFirstCard + "and " + userSecondCard);
		System.out.println("Your total is " + userCardSum + ".\n");
		
		System.out.println("The dealers cards are " + dealerFirstCard + " and another hidden card.\n");
		System.out.println("The dealer total is also hidden.");
		
		
		//primary while starts here
		while(userCardSum <= 21 && dealerCardSum <= 21) {
			System.out.println("Would you like to hit or stay?\n");
			String userInput = input.next();
			
			//loops for bad user input
			while(!"hit".equals(userInput) && !"stay".equals(userInput)) {
				System.out.println("Improper input. Please choose \"hit\" or \"stay\"");
				userInput = input.next();
			}
			
			//loop for player 'hit' 
			while("hit".equals(userInput)) {
				int newRandom = 2 + r.nextInt(11);
				System.out.println("You drew " + newRandom + ".");
				userCardSum += newRandom; 
				System.out.println("Your total is now " + userCardSum + ".");
				
					if(userCardSum == 21) {
						userWin = true;
						break;
					}
					
					if(userCardSum > 21) {
						dealerWin = true;
						break;
					}
					
					System.out.println("Would you like to \"hit\" or \"stay\"?");
					userInput = input.next();
			}
			
			
			//system exit if player has won
			if(userWin == true) {
				System.out.println("You win (21 condition).");
				System.exit(0);
			}
			
			//system exit if dealer has won
			if(dealerWin == true) {
				System.out.println("Dealer wins. You went over 21.");
				System.exit(0);	
			}
			
			//dealer turn
			while(dealerCardSum <= 16) {
				int newRandom = 2 + r.nextInt(11);
				System.out.println("The dealer drew " + newRandom);
				dealerCardSum += newRandom;
				System.out.println("The dealers new total is " + dealerCardSum);
				
					if(dealerCardSum == 21) {
						System.out.println("Dealer landed 21. Dealer wins.");
						break;
					}  if(dealerCardSum > 21) {
						System.out.println("Dealer busted. User wins.");
						break;
					}
				
			}
			
		
			
		}
		
		
//		
//		
//		if(userInput.equalsIgnoreCase("hit")) {
//			isHitting = true;
//		} else if(userInput.equalsIgnoreCase("stay")) {
//			isHitting = false;
//		} else {
//			System.out.println("Invalid input. Try again. Hit or Stay?");
//			userInput = input.next();		
//		}
//			
//		
			
	
	}
}
