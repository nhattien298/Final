package test;

import code.InFor;

public class sub_Infor2 extends InFor {
//	public InFor inFor;
	public void method() {
//		this.inFor.b ==> khong truy cap duoc. vi khac package.
//		super.b  ==> cung tuong tu nhu la import code.InFor + public InFor infor. super la cha
		
		super.c =4;
	}
}
