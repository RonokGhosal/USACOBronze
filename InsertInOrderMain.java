package APComputerScience;

public class InsertInOrderMain {
	static int x[] = {1,2,3,4,5,6};
	
	public static void main(String[] args) {
	  insertInOrder(x, 5, 9);
	}

	private static void insertInOrder(int[]a, int n1, int newValue) {
	  x = a;
	  n1 = a.length-1;
	  System.out.println("n1 is " + n1);
	  int k = n1;
	  while(k > 0 && a[k-1] > newValue) {
		  a[k] = a[k-1];
		  k--;
	  }
	  a[k] = newValue;
      for(int i=0; i<a.length; i++){
	    System.out.print(a[i]);
	    // output: 0123456
	  }
	}
	
}
