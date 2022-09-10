package java_45_abstract;

public class Circle extends Hinh {
	private double r;
	public Circle(ToaDo toaDo) {
		super(toaDo);
		// TODO Auto-generated constructor stub
	}
	
	public Circle(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r;
	}
	
	
}
