package APComputerScience;

public class MotionMain {

	public static void main(String[] args) {
		//Blah 
	    Motion ronok = new RonokExercising();
		executeMotion(ronok);
	}
	
	public static void  executeMotion(Motion motion) {
		System.out.println(" Motion RunningSpeed " + motion.runSpeed());
		System.out.println(" Motion Walking speed is " + motion.walkSpeed());
	}

}
