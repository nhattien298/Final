package java_36;

public class Sach {
	private String tenSach;
	private double giaBan;
	private TacGia tacGia;
	private int namXuatBan;
	public Sach(String tenSach, double giaBan, TacGia tacGia, int namXuatBan) {
		
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.tacGia = tacGia;
		this.namXuatBan = namXuatBan;
	}
	public String getTenSachString() {
		return tenSach;
	}
	public void setTenSachString(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	
	public boolean kiemTraCungNamXuatBan(Sach sachKhac) {
//		if(this.namXuatBan == sachKhac.namXuatBan) {
//			return true;
//		}else {
//			return false;
//		}
		return this.namXuatBan == sachKhac.namXuatBan;
	}
	public double giaSauKhiGiam(double x) {
		return this.giaBan*(1-x/100);
	}
	
	
}
