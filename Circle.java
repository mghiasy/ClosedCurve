package lab2.prog2_2;

//FINLA CLASS CANNOT BE INHERITED

public final class Circle {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public String computeArea() {
		double area = Math.PI * radius * radius;
		return "Area of Circle is " + area;
	}
}