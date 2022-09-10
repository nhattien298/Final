package java_36;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(5, 9, 2011);
		Ngay ngay3 = new Ngay(19, 10, 1921);
		
		TacGia tacGia1 = new TacGia("nhattien", ngay1);
		TacGia tacGia2 = new TacGia("tue lam", ngay3);
		TacGia tacGia3 = new TacGia("tua man", ngay2);
		
		Sach sach1 = new Sach("laptrinh java",	50000	, tacGia2, 2021 );
		Sach sach2 = new Sach("laptrinh python",	150000	, tacGia1, 2021 );
		Sach sach3 = new Sach("laptrinh c",	450000	, tacGia3, 1921 );
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		System.out.println("-------------------------");
		System.out.println(" so sach sach 1 va sach 3 : " + sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println(" so sanh sach 1 va sach 2 : " + sach1.kiemTraCungNamXuatBan(sach2));
		System.out.println(" so sach sach 2 va sach 3 : "+ sach2.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("-------------------------");
		System.out.println(" sach 1 giam gia 10% : "+ sach1.giaSauKhiGiam(10));
		System.out.println(" sach 2 giam gia 50% : "+ sach2.giaSauKhiGiam(50));
		System.out.println(" sach 3 giam gia 30% : "+ sach3.giaSauKhiGiam(30));
	}
}
