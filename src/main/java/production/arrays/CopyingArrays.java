package production.arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNum = 1 + r.nextInt(99);
		
		int[] arrayOne = new int[10];
		
		for(int index = 0; index < 10; index++) {
			arrayOne[index] = randomNum;
		}

	}

}
