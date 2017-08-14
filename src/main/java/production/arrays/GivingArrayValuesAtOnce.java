package production.arrays;

public class GivingArrayValuesAtOnce {

	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };
		
		int[] arr2 = { 1, 2, 3, 4, 5 };

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i = 0; i < 5; i++ ) {
			System.out.print( arr1[i] + " " );
		}
			
		System.out.print("\n\nThe second array is filled with the following values:\n\t");
			for(int i = 0; i < 5; i++ ) {
			System.out.print( arr2[i] + " " );
		}


	}
	
	
	
}

