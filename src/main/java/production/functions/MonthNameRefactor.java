package production.functions;

public class MonthNameRefactor {

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
			
			
			public String month_name(int monthNum) {
				String[] months = new String[12]; 
				String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
				int index = monthNum - 1;
				;
						
			

		}


	}


