package production.forloops;

public class ALetterAtATime {

	public static void main(String[] args) {
		
		String message = "A man, a plan, a canal: Panama!";
		
		
		for(int current = 0; current < message.length(); current++) {
			int count = 1;
			System.out.println(count + " - " + message.charAt(current));
			count++;
			
		}

	}

}
