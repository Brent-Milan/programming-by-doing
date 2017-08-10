package production.functions;
import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on ");
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		String date = "";
		int yy = yyyy - 1900;
		int x = month_offset(mm);
		int total = (yy / 4) + yy + dd + x;
		boolean leapYear = is_leap(yyyy);
			if(leapYear == true && mm == 1 || leapYear == true && mm == 2) {
				total -= 1;
			}
//		int remainder = total / 7;
		

		

		date = month_name(mm) + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
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

	public static int month_offset( int month ) {
		int result;
		switch(month) {
			case 1: result = 1;
					break;
			case 2: result = 4;
					break;
			case 3: result = 4;
					break;
			case 4: result = 0;
					break;
			case 5: result = 2;
					break;
			case 6: result = 5;
					break;
			case 7: result = 0;
					break;
			case 8: result = 3;
					break;
			case 9: result = 6;
					break;
			case 10: result = 1;
					break;
			case 11: result = 4;
					break;
			case 12: result = 6;
					break;
			default: result = -1;
		}
		return result;
	}
	
	public String weekdayName(int ) {
		switch
	}
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}