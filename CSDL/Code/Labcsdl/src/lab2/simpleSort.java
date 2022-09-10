package lab2;

public class simpleSort {
    public void display(int []a){
        int i;
        for(i=0;i< a.length;i++){
            System.out.print(" "+ a[i]);
        }
        System.out.println();
    }
    public void swap(int []a , int i , int k){
        int x;
        x=a[i];
        a[i]= a[k];
        a[k]=x;
    }
    public void selectionSort(int []a){
        display(a);
        System.out.println(" ---------");
        for(int i =0; i< a.length; i++){
            boolean isSorted = true;
            int minIndex = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
            if(i!= minIndex){
                swap(a,minIndex,i );
            }
            display(a);
        }
    }
    public void insertionSort(int [] a){
        display(a);
        System.out.println("------------");
        for (int i = 1; i < a.length; i++) {
            int currentValue = a[i];
            int j = i-1;
            while(j>=0 && currentValue< a[j]){
                a[j+1]= a[j];
                j--;

            }
            //swap
            a[j+1] = currentValue;
            display(a);
        }
    }

    public int Search(int[] a, int i) {
        for (int j = 0; j < a.length; j++) {
            if(a[j] == i){
                return j;
            }
        }
        return -1;
    }
}
