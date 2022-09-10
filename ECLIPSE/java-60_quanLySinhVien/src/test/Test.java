package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.Sinhvien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luachon = 0;

		do {
			System.out.println("Menu ---------------");
			System.out.println("vui long chon chuc nang: ");
			System.out.println("1.	them sinh vien moi vao danh sach. \n" + "2.	In danh sach sinh vien ra man hinh.\n"
					+ "3.	kiem tra danh sach xem co rong hay khong?. \n"
					+ "4.	lay ra so luong sinh vien trong danh sach.\n" + "5.	lam rong danh sach sinh vien.\n"
					+ "6.	kiem tra xem sinh vien co ton tai trong danh sach hay khong, dua vao ma sinh vien.\n"
					+ "7.	xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
					+ "8.	tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim.\n"
					+ "9.	xuat ra danh sach sinh vien co diem tu cao den thap.\n"
					+ "0.	thoat khoi chuong trinh.\n");
			luachon = sc.nextInt();
			sc.nextLine();

//			1.	them sinh vien moi vao danh sach.
			if (luachon == 1) {
				System.out.println("nhap ma sinh vien");
				String maSinhvien = sc.nextLine();
				System.out.println("nhap ho va ten");
				String hoVaTen = sc.nextLine();
				System.out.println("nhap nam sinh");
				int namSinh = sc.nextInt();
				System.out.println("nhap diem trung binh");
				float diemTrungBinh = sc.nextFloat();
				Sinhvien sv = new Sinhvien(maSinhvien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);

//				2.	In danh sach sinh vien ra man hinh
			} else if (luachon == 2) {
				dssv.inDanhSachSinhVien();

//				3.	kiem tra danh sach xem co rong hay khong?
			} else if (luachon == 3) {
				System.out.println("kiem tra danh sach rong: " + dssv.kiemTraDanhSachRong());

//				4.	lay ra so luong sinh vien trong danh sach.
			} else if (luachon == 4) {
				System.out.println("so luong sinh vien trong danh sach: " + dssv.laySoLuongSinhVien());

//				5.	lam rong danh sach sinh vien.
			} else if (luachon == 5) {
				dssv.lamRongDanhSach();
				System.out.println("da lam rong sanh sach sinh vien");

//				6.  kiem tra xem sinh vien co ton tai trong danh sach hay khong, dua vao ma sinh vien.
			} else if (luachon == 6) {
				System.out.println("nhap ma sinh vien");
				String maSinhvien = sc.nextLine();
				Sinhvien sv = new Sinhvien(maSinhvien);
				System.out.println("kiem tra sinh vien co trong danh sach : " + dssv.kiemTraTonTai(sv));

//				7.	xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n
			} else if (luachon == 7) {
				System.out.println("nhap ma sinh vien");
				String maSinhvien = sc.nextLine();
				Sinhvien sv = new Sinhvien(maSinhvien);
				dssv.xoaSinhVien(sv);
				System.out.println("da xoa sinh vien co trong danh sach : " + dssv.kiemTraTonTai(sv));

//				8.	tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim.
			} else if (luachon == 8) {
				System.out.println("nhap ho va ten");
				String hoVaTen = sc.nextLine();
				dssv.timSinhVien(hoVaTen);
//				9.	xuat ra danh sach sinh vien co diem tu cao den thap.
			} else if (luachon == 9) {
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			} else {

			}

		} while (luachon != 0);
	}
}
