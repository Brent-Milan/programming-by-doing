package production.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class BlackjackTest {

	Random r = new Random();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void drawCards() {
		int lowest = 1;
		int highest = 12;
		
		for(int count = 1; count < 10000; count++) {
		int playerCard = 1 + r.nextInt(12);
			if(playerCard < lowest) {
				fail("A number lower than " + lowest + " was generated:" + playerCard);
			}
			
			if(playerCard > highest) {
				fail("A number higher than " + highest + " was generated: " + playerCard);
			}
		
		}
		
	}

}
