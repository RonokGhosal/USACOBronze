package APComputerScience;

public class ContestantMain {
  public static void main(String[] args) {
		
		
		Location loc1 = new Location(0,0);
		Location loc2 = new Location(0,1);
		Location loc3 = new Location(0,2);
		Location loc4 = new Location(1,0);
		Location loc5 = new Location(1,1);
		Location loc6 = new Location(1,2);
		
		Contestant John = new Contestant("John", 160, loc1);
		Contestant Mary = new Contestant("Mary",185,loc2); 
		Contestant Jay = new Contestant("Jay", 22,loc3); 
		Contestant Harry = new Contestant("Harry",190,loc4); 
		Contestant Ted = new Contestant("Ted",100,loc5); 
		Contestant Joan = new Contestant("Joan",88,loc6);
		Contestant[][] c = new Contestant[2][3];
		c[0][0] = John;
		c[0][1] = Mary;
		c[0][2] = Jay;
		c[1][0] = Harry;
		c[1][1] = Ted;
		c[1][2] = Joan;
		ContestantOrganizer c1 = new ContestantOrganizer(c);
		c1.sortAllRows();
		c1.getContestests();
  }
}

		
		
		
		     
				  
				   
				   

			  
			   
	



