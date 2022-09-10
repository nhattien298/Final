package java_47_interface;



public class SapXepChon implements SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int i,j;
		double k;
		for(i=1; i<arr.length; i++) {
			k =  arr[i];
			j= i-1;
			while ( j>=0 && arr[i] > k) {
				arr[j+1]= arr[j];
				j=j-1;
			}
			arr[j+1]=k;
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i,j;
		double k;
		for(i=1; i<arr.length; i++) {
			k =  arr[i];
			j= i-1;
			while ( j>=0 && arr[i] < k) {
				arr[j+1]= arr[j];
				j=j-1;
			}
			arr[j+1]=k;
		}
		
	}

}
