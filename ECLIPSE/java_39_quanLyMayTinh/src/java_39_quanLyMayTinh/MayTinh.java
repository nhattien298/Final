package java_39_quanLyMayTinh;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngaySanXuatNgay;
	private double giaBan;
	private double thoiGianBaoHanh;
	public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuatNgay, double giaBan, int thoiGianBaoHanh) {
		
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuatNgay = ngaySanXuatNgay;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public Ngay getNgaySanXuatNgay() {
		return ngaySanXuatNgay;
	}
	public void setNgaySanXuatNgay(Ngay ngaySanXuatNgay) {
		this.ngaySanXuatNgay = ngaySanXuatNgay;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean kiemTraGiaThapHon(MayTinh mayTinhKhac) {
		return this.giaBan< mayTinhKhac.giaBan;
	}
	public String layTenQuocGia() {
		return this.hangSanXuat.layTenQuocGia();
	}
}
