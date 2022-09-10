package sap_xep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {1,4,6,9,3,8,7,6};
        System.out.println(Arrays.toString(selectionSort(a)));
    }
    public  static int[] selectionSort(int[]a){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]< a[minIndex]){
                    minIndex = i;
                    int temp = a[minIndex];
                    a[minIndex] =a[j];
                    a[j]= temp;

                }
            }
        }
        return a;
    }
}
