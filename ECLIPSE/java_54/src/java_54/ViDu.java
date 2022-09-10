package java_54;

import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		String mang1[] = new String[3];
		mang1[0] = "nhattien";
		mang1[1] = "tue lam";
		mang1[2] = "ttue man";

		String[] mang2 = { "nhattien", " tue lam", "ttueman " };

		String[] mang3 = new String[] { "nhattien", " tue lam", "tue man" };

		int[] array1 = { 1, 2, 3 };

//		int[] array1a = array1;
//		array1a[0] = 100;
//
//		System.out.println(array1a[0]);
//		System.out.println("mang1a : " + Arrays.toString(array1a));
//		System.out.println("mang1a : " + Arrays.toString(array1));

//		int[] mang1b = array1.clone();
//		mang1b[0] = 100;
//		System.out.println("mang 1 b : " + Arrays.toString(mang1b));
//		System.out.println("mang 1  : " + Arrays.toString(array1));
//		

		int[] mang1b = new int[array1.length];
		System.arraycopy(array1, 0, mang1b, 0, array1.length);
		mang1b[0] = 100;
		System.out.println("mang 1 b : " + Arrays.toString(mang1b));
		System.out.println("mang 1  : " + Arrays.toString(array1));

	}
}
