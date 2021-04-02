package APComputerScience;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class myClass{
	public static void main(String args[]) throws FileNotFoundException {
		File fileName = new File("/Users/mac/Desktop/TestFolder/my.txt");
		// windows --> C:\Directory\FileName.txt
		// Mac or Linux -->  C:\ == /Users/mac
		// File name with path on MAC -> /Users/mac/Foo.txt  IS EQUIVALENT TO Windows C:\Users\mac\Foo.txt
		//Path of this file is —>  /Users/mac/Desktop/TestFolder/File-1.rtf
		//“cd <name of the directory>” —> This will change directory to the named one
		//“cd ..” —> This will move you up by one level
		//“cd ../..” —> This will move you up by two levels
		Scanner scan = null;
		  try {
			  ArrayList<String> allLines = new ArrayList<String>();
			scan = new Scanner(fileName);
			Scanner scan2 = new Scanner(System.in);
			int a = scan2.nextInt();
			int linenumber = 0;
			while(scan.hasNextLine()) {
		      String line = scan.nextLine();
				 // process the line
		      linenumber ++;
		      allLines.add(line);
		}
			int size = allLines.size();
			for(int i = a-1 ; i >= 0; i--) {
				System.out.println(allLines.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println(" My explicit way of printing the stack trace: " + e);
			e.printStackTrace();
		}
		
	}
}