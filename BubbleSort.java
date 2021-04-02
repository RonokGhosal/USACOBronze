package APComputerScience;

public class BubbleSort {

  public static void main(String[] args) {
	int numbers[] = {4,5,3,1,2};
    int temp;
    boolean fixed = false;
    while(fixed == false){
      fixed = true;
      for(int i = 0; i < numbers.length-1; i++){
        if(numbers[i] > numbers[i+1]) {
          temp = numbers[i+1];
          numbers[i+1] = numbers[i];
          numbers[i] = temp;
          fixed = false;
        	
        }
    	  
      }
      for(int i = 0; i < numbers.length;i++) {
        System.out.print(numbers[i]);
      }
      System.out.println();
      
    }
    
			
  }
  
		
  }



