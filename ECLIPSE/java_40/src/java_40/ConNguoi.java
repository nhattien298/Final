package java_40;

public class ConNguoi {
	private String hoVaTenString;
	private int namSinh;
	public ConNguoi(String hoVaTenString, int namSinh) {
		
		this.hoVaTenString = hoVaTenString;
		this.namSinh = namSinh;
		
	}
	public String getHoVaTenString() {
		return hoVaTenString;
	}
	public void setHoVaTenString(String hoVaTenString) {
		this.hoVaTenString = hoVaTenString;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void an() {
		System.out.println(" mam mam");
	}
	public void uong() {
		System.out.println("uc uc");
	}
	public void ngu() {
		System.out.println("kho kho");
	}
}
