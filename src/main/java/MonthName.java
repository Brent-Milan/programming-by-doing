import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of the month (1-12");
		String userInput = input.nextInt();
		
		System.out.println("Your month is " + returnMonth(userInput));

	} // end main
	
	
	public String month_name(int monthNum) {
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
			return "June"
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
			System.out.println("Nonsense. Try again");			
		}
	}
	

}
