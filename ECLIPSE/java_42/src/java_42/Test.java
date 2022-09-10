package java_42;

public class Test {
 public static void main(String[] args) {
	NguoiVietNam vNam = new NguoiVietNam("nhattien", 1986);
	NguoiMy johNguoiMy = new NguoiMy("john", 1990);
	NguoiBaLan baLan = new NguoiBaLan("balan", 2003);
	
	vNam.xinchao();
	johNguoiMy.xinchao();
	baLan.xinchao();
}
}
