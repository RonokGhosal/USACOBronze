package APComputerScience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cowNumber{
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("How many Cows ?");
    	int n = scan.nextInt();
    	System.out.println("What number your cows dont like ?");
    	int l  = scan.nextInt();
    	int lableNum = 0;
    	ArrayList<String> arr = new ArrayList<String>();
    	String lableNumS = Integer.toString(lableNum);
    	String unlike =  Integer.toString(l);
    	while(arr.size()<20) {
    		// contains
    		//if((Integer.toString(lableNum).indexOf(l) != -1)){
    		  if(Integer.toString(lableNum).contains(unlike)) {
    		  lableNum = lableNum+1;	
    		}else {		
    			arr.add(Integer.toString(lableNum));
    			
    			lableNum = lableNum+1;
    		}
    		
    	}
    	int last = arr.size() -1;
    	System.out.println(arr.get(last));

    
    }
}