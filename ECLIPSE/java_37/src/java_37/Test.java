package java_37;

public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(29, 8, 1986);
	Ngay ngay2 = new Ngay(20, 10, 2015);
	Ngay ngay3 = new Ngay(26,07,2029);
	
	HangSanXuat hangSanXuat1 = new HangSanXuat("hang 1", "viet nam");
	HangSanXuat hangSanXuat2 = new HangSanXuat("hang 2", "my");
	HangSanXuat hangSanXuat3 = new HangSanXuat("hang 3", "trung quoc");
	
	BoPhim boPhim1 = new BoPhim("tiec trang mau", 2019, hangSanXuat2, 95000, ngay1);
	BoPhim boPhim2 = new BoPhim("tro choi vuong quyen", 2013, hangSanXuat1, 90000, ngay3);
	BoPhim boPhim3 = new BoPhim("the wicher", 2018, hangSanXuat3, 100000, ngay2);

	System.out.println("so sanh gia phim1 re hon phim 2 : " + boPhim1.kiemTraGiaVeReHon(boPhim2));
	System.out.println("so sanh gia phim1 re hon phim 3 : " + boPhim1.kiemTraGiaVeReHon(boPhim3));
	System.out.println("so sanh gia phim2 re hon phim 3 : " + boPhim2.kiemTraGiaVeReHon(boPhim3));

	System.out.println(" ten hang san xuat bo phim3 : "+ boPhim3.layTenHangSanxuat());
	
	System.out.println("-------------------");
	
	System.out.println("bophim1 giam  10% : "+ boPhim1.giaSauKhuyenMai(10));
	System.out.println("bophim2 giam  30% : "+ boPhim1.giaSauKhuyenMai(30));
	System.out.println("bophim3 giam  50% : "+ boPhim1.giaSauKhuyenMai(50));
}
}
