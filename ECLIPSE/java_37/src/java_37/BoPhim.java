package java_37;

public class BoPhim {
	private String tenPhimString;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieuNgay;
	public BoPhim(String tenPhimString, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieuNgay) {
		
		this.tenPhimString = tenPhimString;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieuNgay = ngayChieuNgay;
	}
	public String getTenPhimString() {
		return tenPhimString;
	}
	public void setTenPhimString(String tenPhimString) {
		this.tenPhimString = tenPhimString;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieuNgay() {
		return ngayChieuNgay;
	}
	public void setNgayChieuNgay(Ngay ngayChieuNgay) {
		this.ngayChieuNgay = ngayChieuNgay;
	}
	
	public boolean kiemTraGiaVeReHon(BoPhim phimkhac) {
		return this.giaVe < phimkhac.giaVe;
	}
	
	public String layTenHangSanxuat() {
		return this.hangSanXuat.getTenHangSx();
		
	}
	public double giaSauKhuyenMai(double x) {
		return this.giaVe*(1-x/100);
	}
}
