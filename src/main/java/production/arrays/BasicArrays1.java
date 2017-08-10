package production.arrays;

public class BasicArrays1 {

	public static void main(String[] args) {
		
		int[] anArray = new int[10];
		
		int element = -113;
		
		for(int index = 0; index < 10; index++) {
			anArray[index] = element;
		}
		
		
		for(int count = 0; count < anArray.length; count++) {
			System.out.println("The element " + anArray[count] + " is at index " + count);
		}
		
		

	}

}
