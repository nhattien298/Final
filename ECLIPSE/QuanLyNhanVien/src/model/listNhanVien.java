package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listNhanVien {
	static ArrayList<nhanVien> listNV = new ArrayList<>();

	public void inputs() {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		do {
			nhanVien nv = new nhanVien();
			nv.input();
			listNV.add(nv);
			System.out.println("ban muon them thomg tin ? (y/n)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("y"));
	}

	public void output() {
		for (nhanVien nhanVien : listNV) {
			nhanVien.ouput();
		}
	}

	public int findByID(String maNV) {
		Scanner sc = new Scanner(System.in);
		maNV = sc.nextLine();
		for (int i = 0; i < listNV.size(); i++) {
			nhanVien nv = listNV.get(i);

			if (nv.getMaNV().equalsIgnoreCase(maNV)) {
				System.out.println("da tim thay nhan vien trong he thong tai vi tri" + i);
				nv.ouput();
				return i;
			}
		}
		return -1;
	}

	public void delByID(String maNV) {
		int pos = findByID(maNV);
		if (pos < 0) {
			System.out.println(" khong tim thay");
		} else {

			listNV.remove(pos);
			System.out.println(" da xoa nhan vien tai vi tri " + pos);

		}
	}

	public void dumyData() {
		listNV.add(new nhanVien("nv1", "nhat tien", 10000));
		listNV.add(new nhanVien("nv2", "tue lam", 40000));
		listNV.add(new nhanVien("nv3", "tue man", 50000));
		listNV.add(new nhanVien("nv4", "thi mai", 30000));
		listNV.add(new nhanVien("nv5", "be huong", 90000));
		listNV.add(new nhanVien("nv6", "be binh", 20000));
		listNV.add(new nhanVien("nv7", "ku bin", 80000));
		listNV.add(new nhanVien("nv8", "thang ken", 60000));
		listNV.add(new nhanVien("nv9", "be dan", 10000));

	}

	public void update(String maNV) {
		int posupdate = findByID(maNV);
		if (posupdate < 1) {
			System.out.println(" khong tim thay nhan vien");
		} else {
			nhanVien nvnew = new nhanVien();
			nvnew.input();
			listNV.set(posupdate, nvnew);
			System.out.println("da cap nhat thanh cong");
		}
	}

	public void findSalary(double min, double max) {
		for (nhanVien nhanVien : listNV) {
			if (nhanVien.getLuong() >= min && nhanVien.getLuong() <= max) {
				nhanVien.ouput();
			}
		}
	}

	public void sapXepTheoTen() {
		for (int i = 0; i < listNV.size(); i++) {
			for (int j = i + 1; j < listNV.size(); j++) {
				if (catTen(listNV.get(i).getHoTen()).compareTo(catTen((listNV.get(j).getHoTen()))) > 0) {
					Collections.swap(listNV, i, j);
				}
			}
		}
	}

	public String catTen(String fullName) {
		String name = fullName.substring(fullName.lastIndexOf(" ") + 1);
		return name;
	}

	public void sapXepTheoThuNhap() {
		for (int i = 0; i < listNV.size(); i++) {
			for (int j = i + 1; j < listNV.size(); j++) {
				nhanVien nvi = listNV.get(i);
				nhanVien nvj = listNV.get(j);
				if (nvi.getThuNhap(nvi.getLuong()) < nvj.getThuNhap(nvj.getLuong())) {
					Collections.swap(listNV, i, j);
				}
			}
		}
	}

	public void getTop5ThuNhap() {
		sapXepTheoThuNhap();
		int top = 5;
		if (listNV.size() < 5) {
			top = listNV.size();
		}
		for (int i = 0; i < top; i++) {
			nhanVien nv = listNV.get(i);
			nv.ouput();
		}
	}

//	public static void main(String[] args) {
//		System.out.println("===>" + catTen("vy nhat tien"));
//	}
}
