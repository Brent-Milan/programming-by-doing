package production.forloops;

public class NoticingEvenNumbers {

	public static void main(String[] args) {
		
		for(int count = 1; count <= 20; count++) {
			if(count % 2 == 0) {
				System.out.println(count + "\t <-- Notice Me, Senpai!");
			} else	{
				System.out.println(count);
			}
		}

		
		
		
	}

}
