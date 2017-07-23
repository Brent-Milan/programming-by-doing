package production.random;

import java.util.Random;

public class RandomBasic {
	
	public static void main(String[] args) {
		
	Random r = new Random();
	
	int count = 1 + r.nextInt(10);
	System.out.println("Here is a random number between 1 and 10: " + "");
	System.out.println(count);
	
	}
	
}
