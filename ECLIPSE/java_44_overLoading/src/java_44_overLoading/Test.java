package java_44_overLoading;

public class Test {
public static void main(String[] args) {
	MyMath myMath = new MyMath();
	System.out.println(" tim min cua 2 so 5 9 : "+ myMath.timMIn(5, 9));
	
	System.out.println("tim min cua 2 so 5.5 va 6 : "+ myMath.timMIn(5.5, 6));
	System.out.println("tong cua 2 so 5 va 6 : "+ myMath.tinhTong(5, 6));
	double array [] = new double [] {2,3,4,5};
	
	System.out.println(" tong cua day so 2 3 4 5 : " + myMath.tinhTong(array));
}
}
