package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "nhat tien", "tu hoc", 9);
		SinhVien sv2 = new SinhVien(101, "Tue lam", "java", 4);
		SinhVien sv3 = new SinhVien(102, "tue man", "tinh hoc", 6);

		SinhVien[] a_SinhVien = new SinhVien[] { sv1, sv2, sv3 };
		Arrays.sort(a_SinhVien);
		System.out.println(Arrays.toString(a_SinhVien));
		System.out.println(a_SinhVien[0].getTen());
		System.out.println(a_SinhVien[1].getTen());
		System.out.println(a_SinhVien[2].getTen());

		// tim kiem
		System.out.println(" tim kiem tien :  " + Arrays.binarySearch(a_SinhVien, sv1));

	}
}
