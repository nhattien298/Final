
public class Test {
public static void main(String[] args) {
	HangSanXuat h1 = new HangSanXuat("hang 1 ", "viet nam");
	HangSanXuat h2 = new HangSanXuat("hang 2 ", "my");
	HangSanXuat h3 = new HangSanXuat("hang 3 ", "nhat ban");
	HangSanXuat h4 = new HangSanXuat("hang 4 ", "han quoc");
	
	PhuongTienDiChuyen p1 = new MayBay(h3, "xang may bay");
	PhuongTienDiChuyen p2 = new XeDap(h1);
	PhuongTienDiChuyen p3 = new XeOto(h4, "huyndai");
	MayBay p4 = new MayBay(h2, "xang may bay");
	
	System.out.println(" lay hang san xuat");
	System.out.println("p1 : "+ p1.layTenHangSanXuat());
	System.out.println("p2 : "+ p2.layTenHangSanXuat());
	System.out.println("p3 : "+ p3.layTenHangSanXuat());
	
	System.out.println("bat dau : ");
	p2.batDau();
	
	System.out.println(" lay van toc : ");
	System.out.println("p1 : "+ p1.layvantoc());
	System.out.println("p2 : "+ p2.layvantoc());
	System.out.println("p3 : "+ p3.layvantoc());
	
	System.out.println("cat canh : ");
	 p4.catCanh();
}
}
