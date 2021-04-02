package APComputerScience;

public class BubbleSortMain {

	public static void main(String[] args) {
	  int[] sampleArray = new int[6];
	  sampleArray[0] = 160; 
	  sampleArray[1] = 185;
	  sampleArray[2] = 22;
	  sampleArray[3] = 190;
	  sampleArray[4] = 100;
	  sampleArray[5] = 88;
	  sort(sampleArray);
	  for(int j = 0; j < sampleArray.length; j++) {
		  System.out.println(sampleArray[j]);
	  }
	  
	}
	public static void sort(int[] arr){
	  int length = arr.length;
	    for(int i = 0; i <= length-1; i++) {
	    	//System.out.println("i is " + i);
		  for(int j = 0; j < length-i; j++) {
			  
			 // System.out.println(" j is " + j);
			if (j < length -1) {
		      if(arr[j]>arr[j+1] ) {
			  int temp = arr[j];
			  arr[j] = arr[j+1];
			  arr[j+1] =temp;
					  
			}// inner for loop
		     
			}   
		  } // outer for loop
		  

		  
		  
	}
		
	}

	
}



