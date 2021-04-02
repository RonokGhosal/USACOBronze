package APComputerScience;

public class ContestantOrganizer {
public static final int NUM_ROWS = 2;

public static final int CONTESTANTS_PER_ROW = 3;

private Contestant[][] contestants;
public ContestantOrganizer(Contestant[][] c) {
	contestants = c;
}

/*private void sort(Contestant[] arr) {
  int length = arr.length;
    for(int j = 0; j < length-1; j++) {
	  for(int i = 0; i < length-j-1; i++) {
	     if(arr[i].getScore()>arr[i+1].getScore()) {
		   int temp = arr[i].getScore();
		   System.out.println("temp is" + temp);
		   int x = arr[i+1].getScore() ;
		   System.out.println("x is " + x);
		   int y= arr[i].getScore();
		   System.out.println("y is " + y);
		   y= x;
		   x=temp;
		   
		   
	     }
	   }
	 }
  System.out.println("Printing out the sorted array");
	for(int i = 0; i < arr.length;i++) {
		  System.out.println(arr[i].getScore());
	}
}*/
private void sort(Contestant[] arr){
	  int length = arr.length;
	    for(int i = 0; i <= length-1; i++) {
	    	//System.out.println("i is " + i);
		  for(int j = 0; j < length-i; j++) {
			  
			 // System.out.println(" j is " + j);
			if (j < length -1) {
		      if(arr[j].getScore()>arr[j+1].getScore() ) {
			  int temp = arr[j].getScore();
			  arr[j].setScore(arr[j+1].getScore());
			 arr[j+1].setScore(temp);
			}// inner for loop
		     
			}
		  }
	    }
		  } // outer for loop
public void sortAllRows() {
  for(int i = 0; i < NUM_ROWS; i++ ) {
    sort(contestants[i]);
  }
	
}
public void getContestests() {
  for(int i=0 ; i < 2; i ++) {
    for(int j = 0; j < 3;j++) {
	  System.out.println(contestants[i][j].getName() + "  " + contestants[i][j].getScore());
			
	}
  }
	
}



public String findWinnerName() {
  Contestant[] temparr = new Contestant[2] ;
  sortAllRows();
  for(int i = 0; i < 2; i++ ) {
		temparr[i] = contestants[i][2] ;
   }
  sort(temparr);
  Contestant lastelement = temparr[temparr.length-1];
  return lastelement.getName();
}





}
