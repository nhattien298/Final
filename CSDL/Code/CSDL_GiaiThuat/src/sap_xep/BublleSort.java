package sap_xep;

import java.util.Arrays;

public class BublleSort {
    public static void main(String[] args) {
          int [] a = {1,4,6,9,3,8,7,6};
        bubbleSort(a);
    }
    public static int[] bubbleSort(int [] a){
        for (int giatri:a
        ) {
            System.out.print(giatri+ " ");
        }
        System.out.println("\n");

        for (int i = 0; i < a.length -1; i++) {
//            System.out.println("lan "+ i);
            for (int j = 0; j <a.length-1-i ; j++) {
//                System.out.println("lan cua j "+ j);
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]= temp;
                }
            }
            for (int giatri:a
                 ) {
                System.out.print(giatri+ " ");
            }
            System.out.println();
        }
        return a;
    }


}
