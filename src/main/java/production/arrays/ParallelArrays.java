package production.arrays;

public class ParallelArrays {

	public static void main(String[] args) {
		
		String[] lastNames = { "Kennedy", "Obama", "Clinton", "Lincoln", "Truman" };
		
		double[] grades = { 80.00, 85.00, 70.00, 90.00, 75.00  };
		
		int[] studentId = { 23, 44, 10, 88, 50 };
		
		System.out.println("Student last names: ");
		toString(lastNames);
		
		System.out.println("\n\nStudent grades: ");
		toString(grades);
		
		System.out.println("\n\nStudent IDs: ");
		toString(studentId);
		
		

	} //end main

	
	public static void toString(int[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
	
	public static void toString(String[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	

	public static void toString(double[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
	
}
