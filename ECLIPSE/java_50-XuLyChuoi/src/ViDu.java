import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s;

//		System.out.println(" nhap vao chuoi : ");
//		s = scanner.nextLine();
//		System.out.println(" ------------");
//
//		System.out.println(s.length());
//
//		System.out.println(s.charAt(5));
//
//		char[] arr = new char[10];
//		s.getChars(2, 4, arr, 0);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("ky tu thu : " + i + " la " + arr[i]);
//		}
//
//		byte[] arrayBytes = s.getBytes();
//		for (byte b : arrayBytes) {
//			System.out.println(b);
//		}

		String aString = "Nhattien";
		String bString = "ien";
		boolean check = aString.regionMatches(5, bString, 0, 3);
		System.out.println(check);
	}
}
