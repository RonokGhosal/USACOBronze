package APComputerScience;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Claust{
	public static class Coordinate{
		  int x;
		  int y;
		  public int getX() {
			  return x;
		  }
		  public int getY() {
			  return y;
		  }
		  Coordinate(int a, int b){
			  x = a;
			  y = b;
		  }
		  public double getDistance(Coordinate c) {
			 double d;
			 d = Math.pow(this.getX()-c.getX(),2)+ Math.pow(this.getY()-c.getY(),2);
			 return d;
		  }
		  public int getIndexM(ArrayList<Coordinate> c, Coordinate coor){
			  return (c.indexOf(coor)+1);
		  }
		}
     public static void main(String args[]) {
    	 ArrayList<Coordinate>c = new ArrayList<Coordinate>();
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("How many coordinates?");
    	 int num = scan.nextInt();
    	 for(int i = 0; i < num; i++) {
    		 int x = scan.nextInt();
    		 int y = scan.nextInt();
    		 Coordinate myC = new Coordinate(x,y);
    		 c.add(myC);
    	 }
    	 int min = 999999999;
    
    	 Coordinate mincr1 = new Coordinate(0,0);
    	 Coordinate mincr2 = new Coordinate(0,0);
    	 for(int i = 0; i < num-1; i++) {
    		 for(int j = i+1; j < num; j++) {
    			 double distance = c.get(i).getDistance(c.get(j));
    			 if(distance < min){
    				min = (int) distance;
    				mincr1 = c.get(i);
    				mincr2 = c.get(j);
    				
    				   
    			 }
    		     
    		 }
    	 }
    	 System.out.println(c.indexOf(mincr1)+1 + " " + (c.indexOf(mincr2)+1));
    	
    	 
    }
}