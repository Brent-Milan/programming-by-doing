package production.arrays;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GradesInArrayAndFile {

	public static void main(String[] args) throws IOException {
		
		
		Random r = new Random();
		
		Scanner input = new Scanner(System.in);
		
		//Collects user input to store in file
		System.out.println("Enter the first name of the student: ");
		String studentFirst = input.next();
		
		System.out.println("Enter the last name of the student: ");
		String studentLast = input.next();
		
		System.out.println("Enter the name of the save file: ");
		String studentFile = input.next();
		
		PrintWriter fileWriter = new PrintWriter(new FileWriter(studentFile));
		
		//Creates array for student grades
		int[] gradesInArray = new int[5];
		
		//Populates that array with random numbers ("grades")
		for(int index = 0; index < 5; index++) {
			int randomNum = 1 + r.nextInt(99);
			gradesInArray[index] = randomNum;
		}

		
		//Prints to console name of file 
		System.out.println("\nFile saved under: " + studentFile);
		
		//Prints student name to console + saves full name in array
		/**************************************************************/
		
		System.out.println("\nUser profile: " + studentFirst + " " + studentLast);
		
		String[] nameArray = { "First Name: " + studentFirst, "Last name: " + studentLast };
		
		for(int index = 0; index < nameArray.length; index++) {
			fileWriter.print(nameArray[index]);
		}
		
		/************************************************************/
		
		
		//Prints grades to console + prints grades to file
		System.out.println("Grades for this session are: ");
		
		for(int index = 0; index < gradesInArray.length; index++) {
			System.out.print(gradesInArray[index] + "  ");
			fileWriter.print(gradesInArray[index]);
		}
		
		
		fileWriter.close();
		
		
	} // end main

}
