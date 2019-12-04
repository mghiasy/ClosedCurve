package ClosedCurve_ver2;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		return 4;
	}
	@Override
	public double computePerimeter() {
		return side * 4;
	}


}
