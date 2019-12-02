package lab2.prog2_2;

public final class Triangle  extends ClosedCurve{  

/** base and height variables are defined so that height <= base */
	private final double base;
	private final double height;
	
	public Triangle(double base, double height){
		if (height <= base) {
			this.base = base;
			this.height = height;
		} 
		else {
			this.base = height;
			this.height = base;
		}
	}
	
	@Override
	public String computeArea() {
		//return (0.5 * base * height);
		double area= 0.5 * base * height;
		return "Area of Triangle is "+area;
	}

}



