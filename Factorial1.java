package APComputerScience;

public class Factorial1 {
	  static long fact( long number ) {
	        if (number != 0)  // termination condition
	            return number * fact(number-1); // recursive call
	        else
	            return 1;
	   }

	   public static void main(String[] args) {
	        long number = 20, result;
	        result = fact(number);
	        System.out.println(number + " factorial = " + result);        
	    }
	}

