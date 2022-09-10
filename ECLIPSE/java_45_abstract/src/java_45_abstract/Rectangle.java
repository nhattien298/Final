package java_45_abstract;

public class Rectangle extends Hinh {
	private double chieuRong, chieuCao;

	public Rectangle(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuCao* this.chieuRong;
	}
	
	

}
