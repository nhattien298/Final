package java_38_quanLySinhVien;

public class Test {
public static void main(String[] args) {
	NgaySinh ngay1 = new NgaySinh(29, 8, 1986);
	NgaySinh ngay2 = new NgaySinh(26, 7, 2019);
	NgaySinh ngay3 = new NgaySinh(29, 8, 1986);
	
	Lop lop1 = new Lop("tin hoc can ban", "cong nghe thong tin");
	Lop lop2 = new Lop("lap trinh java", "ky thuat");
	Lop lop3 = new Lop("tcong nghe phan mem", "virut");
	
	SinhVien sv1 = new SinhVien("001", "nhattien", ngay1, 8, lop1);
	SinhVien sv2 = new SinhVien("002", "tuelam", ngay2, 4, lop2);
	SinhVien sv3 = new SinhVien("003", "tue man", ngay3, 6, lop3);
	
	System.out.println("----------------")		;
	System.out.println("ten khoa : ");
	System.out.println("sv1 : "+ sv1.layTenKhoa());
	System.out.println("sv2 : "+ sv2.layTenKhoa());
	System.out.println("sv3 : "+ sv3.layTenKhoa());
	
	System.out.println("----------------")		;
	System.out.println("kiem tra thi dat : ");
	System.out.println("sv1 : "+ sv1.kiemTraThiDat());
	System.out.println("sv2 : "+ sv2.kiemTraThiDat());
	System.out.println("sv3 : "+ sv3.kiemTraThiDat());
	
	System.out.println("----------------")		;
	System.out.println("kiem tra cung ngay sinh : ");
	System.out.println("sv1 vs sv2  : "+ sv1.kiemTraCungNgaysinh(sv2));
	System.out.println("sv1 vs sv3 : "+ sv1.kiemTraCungNgaysinh(sv3));
	
	
	
}
}
