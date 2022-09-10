public class MergeSortedArray_88_c2 {
    public static void main(String[] args) {
        int[] a= {1,4,5,6,0,0,0};
        int []b = {6,2,9};
        int doDaia = 3;
        for (int i = 0;  i <b.length ; i++) {
            a[doDaia + i+1]= b[i];
        }
        for (int val :a
        ) {
            System.out.print(val + " ");
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]> a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println("-------->");

        for (int val :a
        ) {
            System.out.print(val + " ");
        }
    }
}
