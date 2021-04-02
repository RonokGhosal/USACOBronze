package APComputerScience;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Ronok", "Austin", "Texas");
		List<Customer> customers= new ArrayList<Customer>();
		customers.add(customer1);
		
		
		 List<String> lines = new ArrayList<String>();
		 
		 lines.add("Hello @");
		 lines.add("your address is what @?");
		FormLetter f = new FormLetter(lines,customers);
		f.createPersonlaizedLetters(customer1);
	}

}
