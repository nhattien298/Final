package main;

import java.util.Objects;

public class Sinhvien implements Comparable<Sinhvien> {
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTrungBinh;

	public Sinhvien(String maSinhVien) {

		this.maSinhVien = maSinhVien;
	}

	public Sinhvien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {

		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "Sinhvien [maSinhVien = " + maSinhVien + ", hoVaTen = " + hoVaTen + ", namSinh = " + namSinh
				+ ", diemTrungBinh = " + diemTrungBinh + "]";
	}

	@Override
	public int compareTo(Sinhvien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSinhVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinhvien other = (Sinhvien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}

}
