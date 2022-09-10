package java_44_overLoading;

public class MyMath {
	public int timMIn(int a , int b) {
		if(a<b) {
			return a;
		}else {
		
			return b;
		
		}	
	}
	public double timMIn(double a , double b) {
		if(a<b) {
			return a;
		}else {
		
			return b;
		
		}	
	}
	public double  tinhTong (double a, double b) {
		return a+b;
	}
	public double  tinhTong(double [] array) {
		double tong =0;
		for( int i =0; i< array.length; i++) {
			tong+=array[i];
		}
		return tong;
		
	}
	
}
