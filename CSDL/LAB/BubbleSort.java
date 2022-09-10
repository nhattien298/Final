
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ban muon day bao nhieu chu so ?? ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        scanner.close();
       
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
        }
        inDanhSach(a);
        System.out.println(

        "\n"
        );

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            inDanhSach(a);
        }
       
    }

    public static void inDanhSach(int[]a){
        for (int i : a) {
            System.out.print(i+ " ");
        }
        System.out.println();

    }
}
