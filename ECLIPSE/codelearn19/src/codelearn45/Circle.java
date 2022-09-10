package codelearn45;

public class Circle implements IShape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * 3.14;
	}

}
