package APComputerScience;

public class Contestant {
private String name;
private int score;
private Location loc;



public Contestant(String string, int i, Location l) {
 name = string;
 score = i;
 loc = l;
}
public String getName() {
  return name;
}
public int getScore() {
  return score;
}

public void setScore(int s) {
	 score = s;
	}
public Location getLocation() {
  return loc;
	
}
public void updateLocation(int newRow, int newCol) {
  loc = new Location(newRow, newCol);
	
}

 

}
