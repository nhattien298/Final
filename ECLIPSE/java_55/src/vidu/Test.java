package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "nhat tien", "tu hoc", 9);
		SinhVien sv2 = new SinhVien(101, "Tue lam", "java", 4);
		SinhVien sv3 = new SinhVien(102, "tue man", "tinh hoc", 6);
		System.out.println(sv3.compareTo(sv1));
		System.out.println(sv3.compareTo(sv2));
	}

}
