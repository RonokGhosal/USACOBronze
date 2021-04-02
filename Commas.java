package APComputerScience;
import java.util.Scanner;
import java.util.ArrayList;
public class Commas{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        CommaInserter(input);
    }
    static void CommaInserter(int x) {
    	String xString = Integer.toString(x);
    	ArrayList<Character> arr = new ArrayList<Character>(xString.length());
    	if(x<1000) {
    		System.out.println(x);
    	}else {
    	 for(int i = 0; i < xString.length();i++){
    	   arr.add(xString.charAt(i));
    	 }
    	 for(int j = xString.length()-1; j>2; j--) {
    	    j =j-2;
    		arr.add(j, ',');
    	}
    	 for(int i = 0; i < arr.size(); i++) {
        	 System.out.print(arr.get(i)); 
    	 }
    	}
    }
}