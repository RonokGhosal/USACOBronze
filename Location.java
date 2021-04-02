package APComputerScience;

public class Location {
	private int rowNumber;
	private int colNumber;
	
	
	public Location(int row, int col) {
		rowNumber = row;
		colNumber = col;
	}
    public int getRowNumber() {
    	return rowNumber;
    }
    public int getColNumber() {
    	return colNumber;
    }
    //public String toString() {
    	
   // }
    public void updateLocation(int newRow,int NewCol) {
    	rowNumber = newRow;
    	colNumber = NewCol;
    }
    public String toString() {
   	 return ( rowNumber+ "," + colNumber);
   	
   }
}
