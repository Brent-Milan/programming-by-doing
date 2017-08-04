package production.functions;
import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		
		//user input option added
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of the month (1-12):");
		int userInput = input.nextInt();
		
		System.out.println("Your month is " + month_name(userInput) + ".\n");
		
		//provided code for exercise

	    System.out.println( "Month 1: " + month_name(1) );
	    System.out.println( "Month 2: " + month_name(2) );
	    System.out.println( "Month 3: " + month_name(3) );
	    System.out.println( "Month 4: " + month_name(4) );
	    System.out.println( "Month 5: " + month_name(5) );
	    System.out.println( "Month 6: " + month_name(6) );
	    System.out.println( "Month 7: " + month_name(7) );
	    System.out.println( "Month 8: " + month_name(8) );
	    System.out.println( "Month 9: " + month_name(9) );
	    System.out.println( "Month 10: " + month_name(10) );
	    System.out.println( "Month 11: " + month_name(11) );
	    System.out.println( "Month 12: " + month_name(12) );
	    System.out.println( "Month 43: " + month_name(43) );


	} // end main
	
	
	public static String month_name(int monthNum) {
		if(monthNum == 1) {
			return "January";			
		} else if (monthNum == 2) {
			return "February";
		} else if (monthNum == 3) {
			return "March";
		} else if (monthNum == 4) {
			return "April";
		} else if (monthNum == 5) {
			return "May";
		} else if (monthNum == 6) {
			return "June";
		} else if (monthNum == 7) {
			return "July";
		} else if (monthNum == 8) {
			return "August";
		} else if (monthNum == 9) {
			return "September";
		} else if (monthNum == 10) {
			return "October";
		} else if (monthNum == 11) {
			return "November";
		} else if (monthNum == 12) {
			return "December";
		} else {
			return "Nonsense. Try again";			
		}
	}
	

}
