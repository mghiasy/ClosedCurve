package lab2.prog2_2;

//FINLA CLASS CANNOT BE INHERITED

public final class Circle extends ClosedCurve{
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	//OVERRIDE ANNOTATION IS USED TO :
	//IMPROVE READABILITY
	//ANY MISTAKE THROW COMPILER TIME ERROR
	
	@Override
	public String computeArea() {
		double area = Math.PI * radius * radius;
		return "Area of Circle is " + area;
	}
}