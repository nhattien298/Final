package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NangCao {
    public static void main(String[] args) {
        //tạo file 10000 số ngẫu nhiên . dùng lúc đầu để tạo file dữ liệu đầu vào để test các thuật toán
//        autoGenerate(10000);
//        increaseNum(); // 10000 số tăng dần
//        decreaseNum();// 10000 số giảm dần.

        // thời gian xử lý thuật toán tính bằng nanoSecond của các phép toán
        menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn các thuật toán chạy mấy lần ");
        int choice = sc.nextInt();
        System.out.println("Bạn muốn thực hiện các thuật toán với kiểu dữ liệu nào ? ");
        System.out.println("1. 10000 số ngẫu nhiên ");
        System.out.println("2. 10000 số tăng dần ");
        System.out.println("3. 10000 số giảm dần ");
        int kieuDULieu = sc.nextInt();
        switch (kieuDULieu) {
            case 1:
                System.out.println("Test các thuật toán 10000 số ngẫu nhiên");
                int count = 1;
                while (choice > 0) {
                    System.out.println("Lần : "+ count);
                    testThuatToan1();
                    count++;
                    choice--;
                }
                break;

            case 2:
                System.out.println("Test các thuật toán 10000 số tăng dần");
                int count1 = 1;
                while (choice > 0) {
                    System.out.println("Lần : "+ count1);
                    testThuatToan2();
                    count1++;
                    choice--;
                }
                break;
            case 3:
                System.out.println("Test các thuật toán 10000 số giảm dần");
                int count2 = 1;
                while (choice > 0) {
                    System.out.println("Lần : "+ count2);
                    testThuatToan3();
                    count2++;
                    choice--;
                }
                break;
        }
    }


    public static void testThuatToan1() {
        // bubble sort
        long startBubbleSort = System.nanoTime();
        bubbleSort(readFile("so hon loan.txt"));
        long endBubbleSort = System.nanoTime();
        long resultBubbleSort = endBubbleSort - startBubbleSort;
        System.out.println("Thời gian xử lý phép toán của bubble Sort là : " + resultBubbleSort);

        // selection sort
        long startSeletionSort = System.nanoTime();
        selectionSort(readFile("so hon loan.txt"));
        long endSeletionSort = System.nanoTime();
        long resultSeletionSort = endSeletionSort - startSeletionSort;
        System.out.println("Thời gian xử lý phép toán của selection Sort là : " + resultSeletionSort);

        // insertion sort

        long startInsertionSort = System.nanoTime();
        insertionSort(readFile("so hon loan.txt"));
        long endInsertionSort = System.nanoTime();
        long resultInsertionSort = endInsertionSort - startInsertionSort;
        System.out.println("Thời gian xử lý phép toán của insertion Sort là : " + resultInsertionSort);
    }

    public static void testThuatToan2() {
        // bubble sort
        long startBubbleSort = System.nanoTime();
        bubbleSort(readFile("10000 tang dan.txt"));
        long endBubbleSort = System.nanoTime();
        long resultBubbleSort = endBubbleSort - startBubbleSort;
        System.out.println("Thời gian xử lý phép toán của bubble Sort là : " + resultBubbleSort);

        // selection sort
        long startSeletionSort = System.nanoTime();
        selectionSort(readFile("10000 tang dan.txt"));
        long endSeletionSort = System.nanoTime();
        long resultSeletionSort = endSeletionSort - startSeletionSort;
        System.out.println("Thời gian xử lý phép toán của selection Sort là : " + resultSeletionSort);

        // insertion sort

        long startInsertionSort = System.nanoTime();
        insertionSort(readFile("10000 tang dan.txt"));
        long endInsertionSort = System.nanoTime();
        long resultInsertionSort = endInsertionSort - startInsertionSort;
        System.out.println("Thời gian xử lý phép toán của insertion Sort là : " + resultInsertionSort);
    }

    public static void testThuatToan3() {
        // bubble sort
        long startBubbleSort = System.nanoTime();
        bubbleSort(readFile("10000 giam dan.txt"));
        long endBubbleSort = System.nanoTime();
        long resultBubbleSort = endBubbleSort - startBubbleSort;
        System.out.println("Thời gian xử lý phép toán của bubble Sort là : " + resultBubbleSort);

        // selection sort
        long startSeletionSort = System.nanoTime();
        selectionSort(readFile("10000 giam dan.txt"));
        long endSeletionSort = System.nanoTime();
        long resultSeletionSort = endSeletionSort - startSeletionSort;
        System.out.println("Thời gian xử lý phép toán của selection Sort là : " + resultSeletionSort);

        // insertion sort

        long startInsertionSort = System.nanoTime();
        insertionSort(readFile("10000 giam dan.txt"));
        long endInsertionSort = System.nanoTime();
        long resultInsertionSort = endInsertionSort - startInsertionSort;
        System.out.println("Thời gian xử lý phép toán của insertion Sort là : " + resultInsertionSort);
    }


    public static float[] autoGenerate(int maxSize) {
        StringBuilder fileContent = new StringBuilder();
        float[] arr = new float[maxSize];
        Random r = new Random();
        for (int i = 0; i < maxSize; i++) {
            arr[i] = r.nextInt(maxSize);
            fileContent.append(arr[i] + " ");

        }
        writeFile("so hon loan.txt", fileContent.toString());
        return arr;
    }

    public static float[] increaseNum() {
        float[] arr = new float[10000];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            str.append(i + " ");
        }
        writeFile("10000 tang dan.txt", str.toString());
        return arr;
    }

    public static float[] decreaseNum() {
        float[] arr = new float[10000];
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i;
            str.append(i + " ");
        }
        writeFile("10000 giam dan.txt", str.toString());
        return arr;
    }

    public static float[] bubbleSort(float arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j]; // swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    /**
     * Sorting the input array arr using Selection Sort algorithm.
     *
     * @param arr Input array using for sorting
     * @return Returning a sorted array by using the Selection Sort algorithm
     */

    public static float[] selectionSort(float arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int minpos = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            if (minpos != i) {
                float temp = arr[i];
                arr[i] = arr[minpos];
                arr[minpos] = temp;
            }
        }
        return arr;
    }


    /**
     * Sorting the input array arr using Insertion Sort algorithm.
     *
     * @param arr Input array using for searching
     * @return Returning a sorted array by using the Insertion Sort algorithm
     */

    public static float[] insertionSort(float arr[]) {
        int leng = arr.length;
        for (int i = 1; i < leng; i++) {
            float temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j]; // dịch chuyển phần tử vị trí j sang phải
                j--;//tiếp tục kiểm tra phần tử j bên trái tiếp cho đến khi nào j=0 thì thôi.
            }
            arr[j + 1] = temp; // chèn giá trị nhỏ nhất vào vị trí cần phải chèn. ở đây vì cái j-- ở trên sẽ làm cho giá trị âm nên vị trí đúng phải là j+1.
        }
        return arr;
    }

    public static void writeFile(String fileName, String result) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result);
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Reading the file then input to the array arr
     *
     * @param fileName The file name of file to read
     * @return Returning a array read from the file
     */

    public static float[] readFile(String fileName) {

        float[] array;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            line = br.readLine();
            String[] list = line.split("\\s+"); // \\s+ là dành cho trường hợp có nhiều dấu cách liên tiếp.
            array = new float[list.length];
            for (int i = 0; i < list.length; i++) {
                array[i] = Float.parseFloat(list[i]);
//
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return array;

    }

    public static String convertArrayToString(float[] arr) {
        StringBuilder result = new StringBuilder();

        for (float val : arr) {
            result.append(val).append(" ");
        }

        return result.toString();
    }


}
