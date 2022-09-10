package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoichoi = 50000;
		Scanner scanner = new Scanner(System.in);

		Locale lcLocale = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getInstance(lcLocale);

		int luachon = 0;
		do {
			System.out.println("-------- moi ban lua chon ----------");
			System.out.println("chon 1 de tiep tuc choi");
			System.out.println("chon phim bay ky de thoai");
			luachon = scanner.nextInt();
			if (luachon == 1) {
				System.out.println("********bau dau choi********");
				System.out.println(
						"--------- tai khoan cua ban : " + taiKhoanNguoichoi + "^^^^^^^ban muon cuo bao nhieu??^^^^^^");
				// dat cuoc
				double datcuoc;
				do {
					System.out.println("so tien cuoc phai nho hon <= " + taiKhoanNguoichoi);
					datcuoc = scanner.nextDouble();
				} while (datcuoc <= 0 || datcuoc > taiKhoanNguoichoi);

				// chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println(" lua chon 1 <-> tai hoac 2<-> xiu");
					luachon = scanner.nextInt();

				} while (luachon != 1 && luachon != 2);

				// tung xuc xac
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();

				int giaTrixx1 = xucXac1.nextInt(5) + 1;
				int giaTrixx2 = xucXac1.nextInt(5) + 1;
				int giaTrixx3 = xucXac1.nextInt(5) + 1;

				// tinh toan ket qua
				int giaTri;
				giaTri = giaTrixx1 + giaTrixx2 + giaTrixx3;
				System.out.println("gia tri xx 1 : " + giaTrixx1 + " gia tri xx2 " + giaTrixx2 + " gia tri xuc xac 3 "
						+ giaTrixx3);
				System.out.println("ket qua : " + giaTri);
				if (giaTri == 3 && giaTri == 18) {
					System.out.println(" nha cai an het, ban da thua");
					taiKhoanNguoichoi -= datcuoc;
					System.out.println(" tai khooan con lai cua ban la : " + taiKhoanNguoichoi);
				} else if (giaTri >= 4 && giaTri <= 10) {
					System.out.println("tong la : " + giaTri + " ==> xiu ");
					if (luachon == 2) {
						System.out.println("ban da thang cuoc ");
						taiKhoanNguoichoi += datcuoc;
						System.out.println(" tai khooan con lai cua ban la : " + taiKhoanNguoichoi);

					} else {
						System.out.println("ban da thua cuoc ");
						taiKhoanNguoichoi -= datcuoc;
						System.out.println(" tai khooan con lai cua ban la : " + taiKhoanNguoichoi);
					}
				} else {
					System.out.println("tong la : " + giaTri + " ==> tai ");
					if (luachon == 1) {
						System.out.println("ban da thang cuoc ");
						taiKhoanNguoichoi += datcuoc;
						System.out.println(" tai khooan con lai cua ban la : " + taiKhoanNguoichoi);

					} else {
						System.out.println("ban da thua cuoc ");
						taiKhoanNguoichoi -= datcuoc;
						System.out.println(" tai khooan con lai cua ban la : " + taiKhoanNguoichoi);
					}
				}

			}

		} while (luachon == 1);
	}
}
