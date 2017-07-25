package production.forloops;

import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {
	
		Random r = new Random();
		
		int playerCard1 = 1 + r.nextInt(10);
		int playerCard2 = 1 + r.nextInt(10);
		
		System.out.println("The players draws " + playerCard1 + " and " + playerCard2 + ".");
		
		int playerTotal = playerCard1 + playerCard2;
		System.out.println("The player total is " + playerTotal);
		
		int dealerCard1 = 1 + r.nextInt(10);
		int dealerCard2 = 1 + r.nextInt(10);
		
		System.out.println("\nThe dealer draws " + dealerCard1 + " and " + dealerCard2 + ".");
		
		int dealerTotal = dealerCard1 + dealerCard2;
		System.out.println("The dealer total is " + dealerTotal);
		
		if(playerTotal == dealerTotal) {
			System.out.println("\nIt's a tie, folks.");
		} else if (playerTotal > dealerTotal) {
			System.out.println("\nPlayer wins.");
		} else {
			System.out.println("\nDealer wins");
		}
		
		
		
		

	}

}
