package lab1;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[]a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]= rd.nextInt(10);
        }
       printArray(a);
        System.out.println("==========");
        SelectionSort(a);

    }
    public static int[] SelectionSort(int [] a){
        int n = a.length;

        for (int i = 0; i <n-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j <n ; j++) {
                if(a[j]< a[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = a[minIndex];
                a[minIndex]= a[i];
                a[i]= temp;
            }
        }
        return a;

//        for (int i = 0; i < a.length-1 ; i++) {
//            int minIndex =i;
//            for (int j = i+1; j< a.length;j++){
//
//                if(a[j]< a[minIndex]){
//                    minIndex = j; // tim ra duoc vi tri index nho nhat sau moi vong lap.
//                }
//            }
//            //sau moi vong lap thi se swap 1 lan .
//            if(i != minIndex){
//                int temp = a[i];
//                a[i]= a[minIndex];
//                a[minIndex] = temp;
//            }
//            System.out.println("lan thu "+ (i +1));
//            printArray(a);
//            System.out.println();
//        }
//        return a;
    }
    public static void printArray(int [] a){
        for (int val:a
             ) {
            System.out.print(val + " ");
        }
    }

}
