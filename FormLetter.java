package APComputerScience;

import java.util.ArrayList;
import java.util.List;

public class FormLetter {
	

	private List<String> lines;
	private List<Customer> customers;
	public FormLetter(List<String> Ls,List<Customer> c ) {
		lines = Ls;
		customers = c;
	}
	private List<String> makeCopy(){
		List<String> newLines=new ArrayList<String>();
		for(String line: lines) {
			newLines.add(line);
		}
		return newLines;
	}
	public String replaceAll(String line, String sub, String repl) {
		if(lines.contains(sub)) {
			return line.replace(sub,repl);
			
		}
		return "Sorry not there";
	}
	
	public void createPersonlaizedLetters(Customer customer1) {
		 for(int i = 0; i < lines.size(); i++) {
			 if(lines.get(i).contains("@")) {
			String repline	= lines.get(i).replace("@", customer1.getName());
				 System.out.println(repline);
				 
			 }
		 }
		 
		 
	
		
		
	}
}

