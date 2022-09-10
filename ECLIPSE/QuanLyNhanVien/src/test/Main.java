package test;

import java.util.Scanner;

import model.listNhanVien;

public class Main {
	public static void main(String[] args) {
//		listNhanVien ls = new listNhanVien();
		menu();

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		listNhanVien ls = new listNhanVien();
		int choice = 0;

		while (true) {
			System.out.println("0. nhap danh sach mac dinh da tao san");
			System.out.println("1. nhap danh sach");
			System.out.println("2. xuat danh sach");
			System.out.println("3. tim kiem nhan vien theo ma nhan vien");
			System.out.println("4. xoa nhan vien theo ma nhan vien");
			System.out.println("5. cap nhat nhan vien theo ma");
			System.out.println("6. hien thi thong tin theo khoang luong.");
			System.out.println("7. sap xep theo ten.");
			System.out.println("8. sap xep theo thu nhap.");
			System.out.println("9. thong tin top 5 thu nhap");
			System.out.println("----------------");
			System.out.print(" ban chon: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				ls.dumyData();
				break;
			case 1:
				ls.inputs();
				break;
			case 2:
				ls.output();
				break;
			case 3:
				System.out.println(" nhap ma nhan vien muon tim trong he thong");
				String findMaNV = sc.nextLine();
				int pos = ls.findByID(findMaNV);
				if (pos < 0) {
					System.out.println(" khong tim thay nhan vien trong he thong");
				}
				break;
			case 4:
				System.out.println(" nhap ma nhan vien muon xoa trong he thong");
				String delMaNV = sc.nextLine();
				ls.delByID(delMaNV);
				break;
			case 5:
				System.out.println(" nhap ma nhan vien can update");
				String updateMaNV = sc.nextLine();
				ls.update(updateMaNV);
				break;
			case 6:
				System.out.println(" nhap khoang luong tu :");
				double minsalary = sc.nextDouble();
				System.out.println(" khoang luong den : ");
				double maxsalary = sc.nextDouble();
				ls.findSalary(minsalary, maxsalary);
				break;
			case 7:
				ls.sapXepTheoTen();
				ls.output();
				break;
			case 8:
				ls.sapXepTheoThuNhap();
				ls.output();
				break;
			case 9:
				ls.getTop5ThuNhap();

				break;
			}
		}
	}

}
