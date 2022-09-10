package lab1;

import java.util.Random;

import static lab1.SelectionSort.printArray;

public class BubleSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[]b = new int[10];
        int [] a = {5 , 7,  3 , 9,  2,  6,  11};
        for (int i =0; i< b.length; i++){
            b[i] = rd.nextInt(10);
        }
        printArray(a);
        System.out.println();
        System.out.println("-------------");

        bubleSort(a);

        printArray(b);
        System.out.println();
        System.out.println("-------------");
        bubleSort(b);

    }
    public static int[] bubleSort(int[]a){
        for(int i =0; i<a.length-1;i++){
            boolean isSorted = true;
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    isSorted = false;
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
            if(isSorted){
                break;
            }
            printArray(a);
            System.out.println();
        }
        return a;
    }

}
