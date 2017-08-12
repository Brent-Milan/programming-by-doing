package production.printing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "PBD_letter.text";
		String[] anArrayOfStrings = new String[12];
		
		PrintWriter fileWriter = new PrintWriter(new FileWriter(fileName));
		
	
		System.out.println("+--------------------------------------------+");
		System.out.println("|                                       #### |");
		System.out.println("|                                       #### |");
		System.out.println("|                                       #### |");
		System.out.println("|                                            |");
		System.out.println("|                                            |");
		System.out.println("|                                            |");
		System.out.println("|                         Bill Gates         |");
		System.out.println("|                         1 Microsoft Way    |");
		System.out.println("|                         Redmond, WA 98104  |");
		System.out.println("|                                            |");
		System.out.println("+--------------------------------------------+");	
		
		}
		
	}
	
	
	
	fileWriter.close();
}