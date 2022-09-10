package vidu;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String tenSinhVien, tenLop;
	private double diemTrungBinh;

	public SinhVien(int maSinhVien, String tenSinhVien, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		String s = this.tenSinhVien.trim();
		if (s.indexOf(" ") >= 0) {
			int vitri = s.lastIndexOf(" ");
			return s.substring(vitri + 1);
		} else {
			return s;

		}

	}

	@Override
	public int compareTo(SinhVien o) {
		String tenThiString = this.getTen();
		String tenO = o.getTen();
		// TODO Auto-generated method stub
		return tenThiString.compareTo(tenO);
	}

}
