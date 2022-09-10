package java_39_quanLyMayTinh;

import java.security.PublicKey;

public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(29, 8, 1986);
	Ngay ngay2 = new Ngay(26, 7, 2019);
	Ngay ngay3 = new Ngay(20, 10, 2015);
	
	QuocGia quocGia1= new QuocGia("VN", "Viet Nam");
	QuocGia quocGia2= new QuocGia("USA", "MY");
	QuocGia quocGia3= new QuocGia("TQ", "Trung Quoc");
	
	HangSanXuat hangsx1 = new HangSanXuat("PC", quocGia2);
	HangSanXuat hangsx2 = new HangSanXuat("DT", quocGia1);
	HangSanXuat hangsx3 = new HangSanXuat("TV", quocGia3);
	
	MayTinh pc1 = new MayTinh(hangsx3, ngay3, 30000000, 36);
	MayTinh pc2 = new MayTinh(hangsx1, ngay2, 40000000, 12);
	MayTinh pc3 = new MayTinh(hangsx2, ngay1, 15000000, 24);

	System.out.println("so sanh gia pc1 thap hon pc 2 " +pc1.kiemTraGiaThapHon(pc2) );
	System.out.println("so sanh gia pc1 thap hon pc 3 " +pc1.kiemTraGiaThapHon(pc3) );
	System.out.println("so sanh gia pc2 thap hon pc 3 " +pc2.kiemTraGiaThapHon(pc3) );
	
	System.out.println(" tem quoc gia san xuat : ");
	System.out.println("quoc gia san xuat pc1 : "+ pc1.layTenQuocGia());
	System.out.println("quoc gia san xuat pc2 : "+ pc2.layTenQuocGia());
	System.out.println("quoc gia san xuat pc3 : "+ pc3.layTenQuocGia());
}
}
