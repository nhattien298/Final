package java_47_interface;

public class Test {
	public static void main(String[] args) {
		System.out.println("test cau a: ");
		
		MayTinhCasioFx500 mayTinhCasioFx500 = new MayTinhCasioFx500();
		MayTinhVinaCal500 cal500 = new MayTinhVinaCal500();
		System.out.println("5 + 3 = "+mayTinhCasioFx500.cong(5, 3));
		
		System.out.println("test cau b --------------");
		
		double [] arr = new double[] {2,3,4,6,7,8};
		double [] arr2 = new double[] {5,4,7,8,1,3,0,4};
		
		SapXepChon sXepChon = new SapXepChon();
		sapXepChen sxcChen = new sapXepChen();
		
		sxcChen.sapXepGiam(arr2);
		for( int i=0; i<arr2.length; i++) {
			double d= arr2[i];
			System.out.print(d + " " );
		}
		System.out.println("");
		sxcChen.sapXepTang(arr2);
		for( int i=0; i<arr2.length; i++) {
			double d= arr2[i];
			System.out.print(d + " ");
		}
	}
}
