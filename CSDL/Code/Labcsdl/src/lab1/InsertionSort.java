package lab1;

import java.util.Random;

import static lab1.SelectionSort.printArray;

public class InsertionSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int []a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]= rd.nextInt(10);
        }
        printArray(a);
        System.out.println("=================");
        System.out.println();
        insertSort(a);
        
        printArray(a);
    }
    public static int [] insertSort(int [] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int current = a[i];
            int j = i-1;
            while(j>=0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]= current;
        }
        return a;
    }
//    public static int[] insertSort(int[]a){
//        for (int i = 1; i <a.length ; i++) {
//            int current = a[i];
//            int j = i-1;
//            System.out.println("lan "+ i);
//
//            while(j>=0 && current< a[j]){
//                System.out.println("current = "+ current);
//                System.out.println("a [j ] la : "+a[j]);
//                //swap lan 1 , dua gia tri aj len truoc 1 vi tri
//                a[j+1]= a[j];
//                j--;
//                System.out.println("swap 1:");
//                printArray(a);
//            }
//
//            //swap 2 , dua gia tri current vao vi tri aj truoc do
//            if(a[j+1]!= current){
//                a[j+1]= current;
//            }
//            System.out.println("swap 2: ");
//            printArray(a);
//            System.out.println();
//        }
//        return a;

}
