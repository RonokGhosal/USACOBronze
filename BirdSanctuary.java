package APComputerScience;

public class BirdSanctuary {
  public Bird[] birdList;
  public void allEat(){
    for(int i = 0; i < birdList.length; i++ ){
    	System.out.println(" It's  name is " + birdList[i].getName() + " it eats" + birdList[i].getFood());
	  }
	  
  }

}
