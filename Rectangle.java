package closedcurve_ver4;

public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;
	
	public Rectangle(double width,double length) throws IllegalClosedCurveException{
		if (width <= 0 || length <= 0) {
			throw new IllegalClosedCurveException("Negative side or zero");

		}
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	@Override
	public double computeArea() {
		return width * length;
	}
	@Override
	public int getNumberOfSides() {
		return 04;
	}
	@Override
	public double computePerimeter() {
		return 2*(width + length);
	}
}
