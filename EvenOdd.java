package APComputerScience;
import java.math.BigInteger;
import java.util.Scanner;
public class EvenOdd{
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	int x = scan.nextInt();
        for(int i = 0; i < x ; i ++){
    	   String num = scan.next();
    	   boolean EORO = isEven(num);
    	    if(EORO == true){
    	      System.out.println("true");
    	    }else {
    	    	System.out.println("false");
            }
        }
    	}
    static boolean isEven(String n){
         int nlen = n.length();
         if(nlen <= 19) {
        	long numl = Long.parseLong(n);
        	if(numl % 2 == 0) {
        		System.out.println("even");
        		return true;
        	}else {
        		System.out.println("odd");
        		return false;
        	}
        }else{
        	BigInteger two = new BigInteger("2");
        	BigInteger zero = new BigInteger("0");
        	BigInteger bigNum = new BigInteger(n);
        	if(bigNum.mod(two).equals(zero)) {
        		System.out.println("even");
        		return true;
        	}else {
        		System.out.println("odd");
        		return false;
        	}	
    	}
        }
    }

