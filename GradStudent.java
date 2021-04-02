package APComputerScience;

public class GradStudent extends StudentAp
	  {
		  private int gradID;
		  public GradStudent()
		  {
			  super();
			  gradID = 0;
		  }
	  public GradStudent(String studName, int[] studTests, String studGrade, int gradStudID)
	  {
		  super(studName, studTests, studGrade);
		  gradID = gradStudID;
	  }
	  public void computeGrade() {
		   super.computeGrade();
		   if(super.getTestAverage() >= 80) {
			 super.setGrade(" Grad Student Specific Criterion - pass with honor");
		   } 
				 
	  }
	  public int getID() {
		  return gradID;
	  }
	  public String toString() {
			return(getName() +" GradStudent Grade = "  + getGrade());
	  }
}
