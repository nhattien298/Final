package java_45_abstract;

public class Test {
public static void main(String[] args) {
	ToaDo td1 = new ToaDo(5, 5);
	ToaDo td2 = new ToaDo(7	, 9);
	ToaDo td3 = new ToaDo(12, 1);
	ToaDo td4 = new ToaDo(5, 6);
	
//	Hinh hinh1 = new Hinh(td1);  ==> sai cuu phap , lop abstract ko dung new duoc.
	
	Hinh h1= new Diem(td1);
	Hinh h2 = new Circle(td4, 5);
	Hinh h3 = new Rectangle(td2, 5, 10);
	Hinh h4 = new Circle(td3, 8);
	
	System.out.println(" dien tich h1 : "+ h1.tinhDienTich());
	System.out.println(" dien tich h2 : "+ h2.tinhDienTich());
	System.out.println(" dien tich h3 : "+ h3.tinhDienTich());
	System.out.println(" dien tich h4 : "+ h4.tinhDienTich());

}
}
