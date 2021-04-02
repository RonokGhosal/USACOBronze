package APComputerScience;

import java.util.ArrayList;

public class Coordinate{
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

