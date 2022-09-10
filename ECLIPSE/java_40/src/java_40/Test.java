package java_40;



public class Test {
public static void main(String[] args) {
	ConNguoi cNguoi = new ConNguoi("nhattien", 1986);
	cNguoi.an();
	cNguoi.uong();
	cNguoi.ngu();
	
	HocSinh hSinh= new HocSinh("nhattien", 1986, "lop1"	, "dinhquan");
	hSinh.an();
	hSinh.lamBaiTap();
}
}
