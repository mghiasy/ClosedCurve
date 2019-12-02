package lab2.prog2_2;

public final class Square  extends ClosedCurve{
	private final double side;

	public Square(double side) {
		this.side = side;

	}
	
	@Override
	public String computeArea() {
		// return side * side;
		double area = side * side;
		return "Area of Square is " + area;
	}

}
