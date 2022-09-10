package sort;

import java.io.*;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
    public static boolean run = true;

    /**
     * Writing the array read from input array arr to file
     *
     * @param fileName The file name of file to write value
     */

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


    /**
     * Sorting the input array arr using Bubble Sort algorithm.
     *
     * @param arr Input array using for sorting
     * @return Returning a sorted array by using the Bubble Sort algorithm
     */

    public static float[] bubbleSort(float arr[]) {
        StringBuilder fileContent = new StringBuilder();
        printArray(arr);
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true; // improvement , if array is sorted will break the for loop
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    float temp = arr[j]; // swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
            String row = convertArrayToString(arr); // vì mỗi lần thực hiện xong 1 vòng for sẽ xuống dòng mới.
            fileContent.append(row).append("\n");
            writeFile("OUTPUT1.txt", fileContent.toString());
            printArray(arr);
            System.out.println();
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
        StringBuilder fileContent = new StringBuilder();
        printArray(arr);
        System.out.println();
        System.out.println("-----------------------------------------");
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            System.out.println();
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
            String row = convertArrayToString(arr);
            fileContent.append(row).append("\n");
            writeFile("OUTPUT2.txt", fileContent.toString());
            printArray(arr);
        }
        System.out.println();
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
        printArray(arr);
        System.out.println();
        System.out.println("-----------------------------------------");
        StringBuilder fileContent = new StringBuilder();
        for (int i = 1; i < leng; i++) {
            float temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j]; // dịch chuyển phần tử vị trí j sang phải
                j--;//tiếp tục kiểm tra phần tử j bên trái tiếp cho đến khi nào j=0 thì thôi.
            }
            arr[j + 1] = temp; // chèn giá trị nhỏ nhất vào vị trí cần phải chèn. ở đây vì cái j-- ở trên sẽ làm cho giá trị âm nên vị trí đúng phải là j+1.
            String row = convertArrayToString(arr);
            fileContent.append(row).append("\n");
            printArray(arr);
            System.out.println();
        }
        writeFile("OUTPUT3.txt", fileContent.toString());
        return arr;
    }


    /**
     * Searching the indices of elements in array [arr] greater than value. Printing
     * <p>
     * and writing all indices to the console screen and file OUTPUT4.TXT separated by space.
     *
     * @param arr   Input array using for searching
     * @param value The value for searching
     */

    public static void linearsearch(float arr[], float value) {
        int index = -1;
        StringBuilder fileContent = new StringBuilder();
        fileContent.append("Linear Search \n");
        fileContent.append("Input value : " + value + "\n");
        fileContent.append("Indexs are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                index = i;
                fileContent.append(i + " ");

            }
        }
        if (index == -1) {
            fileContent.append("không tìm thấy kết quả");
        }
        writeFile("OUTPUT4.TXT", fileContent.toString());
        System.out.println(fileContent.toString());

    }


    /**
     * Searching by using the Binary Search algorithm. Returning the first index of
     * <p>
     * value if it is present in array arr, otherwise, return -1. The index also
     * <p>
     * written to file OUTPUT5.TXT and shown on the console screen.
     *
     * @param value The value for searching
     * @return The index of the element if found, otherwise, return -1
     */

    public static int binarySearch(float[] arr, float value) {
        StringBuilder fileContent = new StringBuilder();
        fileContent.append("Binary Search" + "\n");
        fileContent.append("Input value : " + value + "\n");
        Arrays.sort(arr);
        int mid = -1;
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            mid = (low + high) / 2;
            if (value < arr[mid]) {// value on the left
                high = mid - 1;
            } else if (value == arr[mid]) {
                if (mid == 0) {
                    fileContent.append("Index of fist element : " + (mid));
                    writeFile("OUTPUT5.TXT", fileContent.toString());
                    System.out.println(fileContent);
                    return mid;
                } else if ((arr[mid] != arr[mid - 1])) {
                    fileContent.append("Index of fist element : " + (mid));
                    writeFile("OUTPUT5.TXT", fileContent.toString());
                    System.out.println(fileContent);
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else { // value on the right
                low = mid + 1;
            }

        }
        fileContent.append("Không tìm thấy kếu quả");
        writeFile("OUTPUT5.TXT", fileContent.toString());
        System.out.println(fileContent);
        return -1;
    }

    // Menu of program
    public static void menu() {

        System.out.println("+-------------------Menu------------------+");
        System.out.println("|   1.Input                               |");
        System.out.println("|   2.Output                              |");
        System.out.println("|   3.Bubble sort                         |");
        System.out.println("|   4.Selection sort                      |");
        System.out.println("|   5.Insertion sort                      |");
        System.out.println("|   6.Search > value                      |");
        System.out.println("|   7.Search = value                      |");
        System.out.println("|   0.Exit                                |");
        System.out.println("+-----------------------------------------+");
        System.out.print("Your choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                input();
                break;
            case 2:
                System.out.println("Read from file");
                System.out.print("Array a : ");
                output();
                break;
            case 3:
                System.out.println("Bubble sort ");
                bubbleSort(readFile("input.txt"));
//                writeFile("OUTPUT1.TXT", bubbleSort(readFile("input.txt")));
                break;
            case 4:
                System.out.println("Selection sort");
                selectionSort(readFile("input.txt"));
//                writeFile("OUTPUT2.TXT", selectionSort(readFile("input.txt")));
                break;
            case 5:
                System.out.println("Insertion sort");
                insertionSort(readFile("input.txt"));
//                writeFile("OUTPUT3.TXT", insertionSort(readFile("input.txt")));
                break;
            case 6:
                System.out.println("linearSearch > value");
                System.out.println("enter the value want to search : ");
                float value = sc.nextFloat();
                linearsearch(readFile("input.txt"), value);
                break;
            case 7:
                System.out.println("binarySearch = value");
                System.out.println("enter the value want to search : ");
                float val = sc.nextFloat();
                binarySearch(readFile("input.txt"), val);
                break;
            case 0:
                System.out.println("Thanks!!!");
                run = false;
                break;
        }

    }

    // Output function, print out the array items.
    public static void output() {
        printArray(readFile("input.txt"));
        System.out.println();

    }

    // Input function, prompt use to input value
    public static void input() {
        StringBuilder fileContent = new StringBuilder();
        System.out.println("How many elements do you want ?? :  ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        float[] array = new float[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("input element : ");
            System.out.print("element " + (i + 1) + ":");
            array[i] = sc.nextFloat();
            fileContent.append(array[i] + " ");
        }
        writeFile("input.txt", fileContent.toString());
    }

    // Print array function . print items of an array
    public static void printArray(float[] arr) {
        for (float value : arr
        ) {
            System.out.print(value + " ");
        }
    }

    // Convert an array to a string
    public static String convertArrayToString(float[] arr) {
        StringBuilder result = new StringBuilder();

        for (float val : arr) {
            result.append(val).append(" ");
        }

        return result.toString();
    }
}
