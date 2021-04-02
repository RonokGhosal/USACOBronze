package APComputerScience;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class myClass2{
	public static void main(String args[]) throws IOException {
		File fileName = new File("/Users/mac/Desktop/TestFolder/my2.txt");
		FileWriter outFile = new FileWriter("/Users/mac/Desktop/TestFolder/my3.txt");
		Scanner scan = null;
		  try {
			  ArrayList<String> allLines = new ArrayList<String>();
			scan = new Scanner(fileName);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter how many lines you wanna scan? :");
			int userInt = scan2.nextInt();
			System.out.println(" Enter the string you wanna delete :" );
			String userString = scan2.next();
			System.out.println("Ok I am going to delete " +  userString + " from first " + userInt + "lines");
			int linenumber = 0;
			while(scan.hasNextLine()) {
		      String line = scan.nextLine();
     	      allLines.add(line);   
		}
			System.out.println(allLines);
			for(int i = 0 ; i <= userInt-1; i++) {
				if(allLines.get(i).contains(userString)) {
				  String newline = allLines.get(i).replace(userString,"");
				  outFile.write(newline + "\n");
				}else {
					outFile.write(allLines.get(i) + "\n");
				}
				
					
			}
		} catch (FileNotFoundException e) {
			System.out.println(" My explicit way of printing the stack trace: " + e);
			e.printStackTrace();
		}
		  outFile.close();
		
	}
}
