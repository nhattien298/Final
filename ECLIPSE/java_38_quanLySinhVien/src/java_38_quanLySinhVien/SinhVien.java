package java_38_quanLySinhVien;

public class SinhVien {
	private String maSinhVien, hoVaTen;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop hocLop;
	public SinhVien(String maSinhVien, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop hocLop) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.hocLop = hocLop;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public Lop getHocLop() {
		return hocLop;
	}
	public void setHocLop(Lop hocLop) {
		this.hocLop = hocLop;
	}
	public String layTenKhoa() {
		return this.hocLop.getTenKhoa();
	}
	public boolean kiemTraThiDat() {
		return this.diemTrungBinh >=5;
	}
	
	public boolean kiemTraCungNgaysinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh);
		
	}
}
