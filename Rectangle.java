package ClosedCurve_ver1;

public class Rectangle extends ClosedCurve {
	private double width;
	private double length;
	
	public Rectangle(double width,double length) {
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
}
