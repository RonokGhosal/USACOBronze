package APComputerScience;

public class FindMaxTestMain {

	public static void main(String[] args) {
		Shape s1 = new Circle(3.0, "circle");
		Shape s2 = new Square(4.5, "square");
		System.out.println("Area of" + s1.getName() + " is " + s1.area());
		System.out.println("Area of" + s2.getName() + " is " + s2.area());
		Shape s3 = (Shape) max(s1,s2);
		System.out.println("The larger shape is the " + s3.getName());

	}

	public static Shape max(Shape s1, Shape s2) {
		if( s1.compareTo(s2) > 0 )
			return s1;
		
		else
			return s2;
		
	}

	

}
