package APComputerScience;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double circleRadius, String circleName)
	{
	super(circleName);
	radius = circleRadius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
