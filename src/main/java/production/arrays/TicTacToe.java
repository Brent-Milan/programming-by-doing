package production.arrays;

import java.util.Scanner;

public class TicTacToe {

	private static char[][] board = new char[3][3];

	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
	
		initBoard();
		displayBoard();
		
		
		
		System.out.println("Player One, where would you like to place your 'x'?");
		
		//player one turn
		System.out.println("Enter first coordinate (x position): ");
		int userInputX = keyboard.nextInt();	
		
		System.out.println("\nEnter second coordinate (y position): ");
		int userInputY = keyboard.nextInt();
		
		reassignToX(userInputX, userInputY);
		displayBoard();
		
		//player two turn
		System.out.println("Player Two, where would you like to place your 'o'?");
		
		System.out.println("Enter first coordinate (x position): ");
		int userInputX = keyboard.nextInt();	
		
		System.out.println("\nEnter second coordinate (y position): ");
		int userInputY = keyboard.nextInt();
		
		reassignToO(userInputX, userInputY);
		displayBoard();
//		
//		//player one turn
//		reassignToX(0, 2);
//		displayBoard();
//		
//		//player two turn
//		reassignToO(1, 0);
//		displayBoard();
//		
//		//player one turn
//		reassignToX(2, 0);
//		displayBoard();
		
		System.out.println("\nPlayer One Wins!");
		
	} //end main
	

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
		System.out.println("\n");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}

	public static void reassignToX(int posX, int posY) {
		board[posX][posY] = 'x'; 
	}
	
	public static void reassignToO(int posX, int posY) {
		board[posX][posY] = 'o'; 
	
	}
} // end class
