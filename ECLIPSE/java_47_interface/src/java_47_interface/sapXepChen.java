package java_47_interface;



public class sapXepChen implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int n =arr.length;
		int i,j,min_idx;
		for ( i=0; i<n;i++) {
			min_idx = i;
			for(j=i+1;j<n;j++) {
				if(arr[j]< arr[i]) {
					min_idx=j;
			double tempDouble = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i]= tempDouble;
			
				}
			}
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n =arr.length;
		int i,j,min_idx;
		for ( i=0; i<n;i++) {
			min_idx = i;
			for(j=i+1;j<n;j++) {
				if(arr[j]> arr[i]) {
					min_idx=j;
			double tempDouble = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i]= tempDouble;
			
				}
			}
		}
		
	}

}
