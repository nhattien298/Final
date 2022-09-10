package java_42;

public class ConNguoi {
	protected String hoVaTen;
	protected int namsinh;
	public String getHoVaTen() {
		return hoVaTen;
	}
	
	public ConNguoi(String hoVaTen, int namsinh) {
		super();
		this.hoVaTen = hoVaTen;
		this.namsinh = namsinh;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	
	public void an() {
		System.out.println("mam mam");
	}
	public void ngu() {
		System.out.println("kho kho kho kho");
	}
}
