package vidu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "xin chao moi nguoi toi la : vy nhat tien";
		String[] aStrings = s.split(" ");
		String[] bStrings = s.split(":");
		System.out.println(Arrays.toString(aStrings));
		System.out.println(Arrays.toString(bStrings));

		String s2 = "xin chao moi. nguoi toi, la : vy nhat tien";
		String[] cString = s2.split("\\.|\\,|\\:");
		System.out.println(Arrays.toString(cString));

		String tenString = "vy nhat tien";
		String[] dString = tenString.split(" ");
		System.out.println(dString[dString.length - 1]);

	}

}
