package code;

public class ViDu {
	private InFor inFor;
	
	public void method() {
//		this.inFor.a; ==> khong truy xuat duoc
		this.inFor.b=3; // truy cap duoc
		this.inFor.c =4;
	}
}
