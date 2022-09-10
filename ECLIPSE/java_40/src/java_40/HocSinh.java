package java_40;

public class HocSinh extends ConNguoi {
	private String tenLop, tenTruong;

	public HocSinh(String hoVaTenString, int namSinh, String tenLop, String tenTruong) {
		super(hoVaTenString, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	
	public void lamBaiTap() {
		System.out.println(" chep chep viet viet");
	}
}
