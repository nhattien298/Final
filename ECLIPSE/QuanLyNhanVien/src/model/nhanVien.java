package model;

import java.util.Scanner;

public class nhanVien {
	private String maNV, hoTen;
	private double luong;

	public nhanVien() {

	}

	public nhanVien(String maNV, String hoTen, double luong) {

		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Nv: ");
		setMaNV(sc.nextLine());
		System.out.println("Ho Ten: ");
		setHoTen(sc.nextLine());
		System.out.println("Luong: ");
		setLuong(sc.nextDouble());

	}

	public void ouput() {
		System.out.println("ma nhan vien=> " + getMaNV() + " ho va ten => " + getHoTen() + " luong => " + getLuong()
				+ "thue thu nhap : " + getThueThuNhap(getLuong()) + "thu nhap :  " + getThuNhap(getLuong()));
	}

	public double getThueThuNhap(double luong) {
		double tax = 0;
		if (luong < 9000) {
			tax = 0;

		} else if (luong <= 15000) {
			tax = (luong - 9000) * 0.1;
		} else {
			tax = (luong - 15000) * 0.12 + 6000 * 0.1;
		}
		return tax;
	}

	public double getThuNhap(double luong) {
		return luong - getThueThuNhap(luong);
	}

	public static void main(String[] args) {
		nhanVien nv = new nhanVien();
		nv.input();
		nv.ouput();
	}

}
