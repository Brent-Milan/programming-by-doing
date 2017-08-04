import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of the month (1-12");
		String userInput = input.nextInt();
		
		System.out.println("Your month is " + returnMonth(userInput));

	} // end main
	
	
	public String returnMonth(int monthNum) {
		if(monthNum == 1) {
			System.out.println("January");			
		} else if (monthNum == 2) {
			System.out.println("February");
		} else if (monthNum == 3) {
			System.out.println("March");
		} else if (monthNum == 4) {
			System.out.println("April");
		} else if (monthNum == 5) {
			System.out.println("May");
		} else if (monthNum == 6) {
			System.out.println("June");
		} else if (monthNum == 7) {
			System.out.println("July");
		} else if (monthNum == 8) {
			System.out.println("August");
		} else if (monthNum == 9) {
			System.out.println("September");
		} else if (monthNum == 10) {
			System.out.println("October");
		} else if (monthNum == 11) {
			System.out.println("November");
		} else if (monthNum == 12) {
			System.out.println("December");
		} else {
			System.out.println("Nonsense. Try again");			
		}
	}
	

}
