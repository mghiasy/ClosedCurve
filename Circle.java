package closedcurve_ver4;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) throws IllegalClosedCurveException {
		if(radius <= 0) {
			throw new IllegalClosedCurveException("Negative or zero radius");
		}
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
	void ss() {
		
	}
}
