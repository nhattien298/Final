package Test;

import code_a.ViDu;

public class TestViDu {
	public static void main(String[] args) {
		ViDu vDu = new ViDu(5, 6);
		System.out.println(vDu.getA());
		
		code_b.ViDu vd2 = new code_b.ViDu(4, 5, 6);
		System.out.println(vd2.getC());
	}
 
}
