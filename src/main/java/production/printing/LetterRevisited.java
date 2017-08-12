package production.printing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "PBD_letter.text";
		String[] anArrayOfStrings = {
		
		"+--------------------------------------------+",
		"|                                       #### |",
		"|                                       #### |",
		"|                                       #### |",
		"|                                            |",
		"|                                            |",
		"|                                            |",
		"|                         Bill Gates         |",
		"|                         1 Microsoft Way    |",
		"|                         Redmond, WA 98104  |",
		"|                                            |",
		"+--------------------------------------------+"	
		
		};
		
		PrintWriter fileWriter = new PrintWriter(new FileWriter(fileName));
		
		for(int index = 0; index < anArrayOfStrings.length; index++) {
			fileWriter.println(anArrayOfStrings[index]);
		}
		
		
		fileWriter.close();
		
		} // end main
		
	
	
}