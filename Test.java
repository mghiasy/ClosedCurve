package ClosedCurve_ver2;

public class Test {

	public static void main(String[] args) {
		Polygon[] obj = { new Triangle(4, 5, 6), new Rectangle(3,4), new Square(3) };
		String res = "";
		for (Polygon polygon : obj) {
			res += "For this " + polygon.getClass().getSimpleName() + "\n";
			res += "Number of sides = " + polygon.getNumberOfSides() + "\n";
			res += "Perimeter =" + polygon.computePerimeter()+ "\n";
		}
		System.out.println(res);
	}

}
