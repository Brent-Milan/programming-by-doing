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
		
		int[] gradesInArray = new int[5];
		
		System.out.println("Enter the first name of the student: ");
		String studentFirst = input.next();
		
		System.out.println("Enter the last name of the student: ");
		String studentLast = input.next();
		
		System.out.println("Enter the name of the save file: ");
		String studentFile = input.next();
		
		
		
		for(int index = 0; index < 5; index++) {
			int randomNum = 1 + r.nextInt(99);
			gradesInArray[index] = randomNum;
		}

		System.out.println("File saved under: " + studentFile);
		PrintWriter fileWriter = new PrintWriter(new FileWriter(studentFile));
		
		System.out.println("\nUser profile: " + studentFirst + " " + studentLast);
		String[] nameArray = { studentFirst, studentLast };
		
		
		for(int index = 0; index < nameArray.length; index++) {
			fileWriter.print(nameArray[index]);
		}
		
		System.out.println("Grades for this session are: ");
		
		for(int index = 0; index < gradesInArray.length; index++) {
			System.out.print(gradesInArray[index] + "  ");
			fileWriter.print(gradesInArray[index]);
		}
		
		
		
		
		
		
	}

}
