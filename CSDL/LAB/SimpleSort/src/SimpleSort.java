import java.util.Random;
import java.util.Scanner;

public class SimpleSort {
    static boolean run = true;
    public static void main(String[] args) {

        while (run){
            menu();

        }


    }
    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = i;
                    int temp = a[minIndex];
                    a[minIndex] = a[j];
                    a[j] = temp;
                }
            }
            inGiaTri(a);
        }
    }

    public static void inGiaTri(int[] a) {
        for (int giatri : a
        ) {
            System.out.print(" " + giatri);
        }
        System.out.println();
    }

    public static void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
            inGiaTri(a);
        }

    }

    public static int binarySearch(int[] a, int timKiem) {
        int low = 0;
        int high = a.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (timKiem < a[mid]) {
                high = mid - 1;
            } else if (timKiem == a[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }
    public static int linearSearch(int[]a, int key){
        int index =-1;
        for (int i = 0; i < a.length; i++) {
            if(key == a[i]){
                index = i;
            }

        }
        return index;

    }
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("xin moi chon do dai cua day so : ");
        int size = sc.nextInt();
        int[] a = new int[size];
        // tao gia tri ngau nhien  cho chuoi so
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(100);
        }
        inGiaTri(a);
        System.out.println();
        return a;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.println("1. Selection sort");
        System.out.println("2. Insert sort");
        System.out.println("3. Search value in array");
        System.out.println("0. Exit");
        System.out.print("your choice is : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                selectSort(input());


                break;

            case 2:
                insertSort(input());

                break;
            case 3:
                System.out.println("value : ");
                int val = sc.nextInt();
                System.out.println(linearSearch(input(),val));


                break;
            case 0:
                System.out.println("goodbye !!!");
                run = false;
                break;

        }
        System.out.println();

    }
}
