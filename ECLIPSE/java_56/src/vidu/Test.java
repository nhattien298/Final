package vidu;

import java.util.Arrays;

public class Test {
	public static int[] daonguoc(int[] x) {
		int[] dao = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			dao[index] = x[i];
			index++;
		}
		return dao;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 9, 6, 5, 3 };
		int[] b = new int[15];

		// ham sap xep
		System.out.println("mang a ban dau : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("mang a sau khi sap xep : " + Arrays.toString(a));
		a = daonguoc(a);
		System.out.println("mang a dao nguoc : " + Arrays.toString(a));

		// ham tim kiem
		int ketQuaTimKiem = Arrays.binarySearch(a, 5);
		System.out.println(ketQuaTimKiem);

		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(Arrays.binarySearch(a, -2));

		// ham dien gia tri
		Arrays.fill(b, 5);
		System.out.println(" mang b sau khi dien gia tri " + Arrays.toString(b));

	}
}
