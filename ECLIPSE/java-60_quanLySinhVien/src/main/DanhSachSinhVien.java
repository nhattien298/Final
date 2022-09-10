package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<Sinhvien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<Sinhvien>();
	}

	public DanhSachSinhVien(ArrayList<Sinhvien> danhSach) {

		this.danhSach = danhSach;
	}

//	1.	them sinh vien moi vao danh sach.
	public void themSinhVien(Sinhvien sv) {
		this.danhSach.add(sv);
	}

//	2.	In danh sach sinh vien ra man hinh
	public void inDanhSachSinhVien() {
		for (Sinhvien sinhvien : danhSach) {
			System.out.println(sinhvien);
		}
	}

//	3.	kiem tra danh sach xem co rong hay khong?
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

//	4.	lay ra so luong sinh vien trong danh sach.
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

//	5.	lam rong danh sach sinh vien.
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

//	6.kiem tra xem sinh vien co ton tai trong danh sach hay khong, dua vao ma sinh vien.
	public boolean kiemTraTonTai(Sinhvien sv) {

		return this.danhSach.contains(sv);
	}

//	7.	xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\
	public boolean xoaSinhVien(Sinhvien sv) {
		return this.danhSach.remove(sv);
	}

//	8.	tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim.
	public void timSinhVien(String ten) {
		for (Sinhvien sinhvien : danhSach) {
			if (sinhvien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhvien);
			}
		}
	}

//	9.	xuat ra danh sach sinh vien co diem tu cao den thap.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<Sinhvien>() {

			@Override
			public int compare(Sinhvien sv1, Sinhvien sv2) {
				// TODO Auto-generated method stub
				if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				} else if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				} else {
					return 0;
				}
			}

		});
	}
}
