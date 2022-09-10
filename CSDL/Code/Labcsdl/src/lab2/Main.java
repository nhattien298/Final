package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, choice;
        int[] a = {
                5,
                7,
                11,
                3,
                9,
                2,
                6
        };
        simpleSort t = new simpleSort();
        while (true) {
            System.out.println("\n Choose your option:");
            System.out.println("  1. Display data");
            System.out.println("  2. Selection sort");
            System.out.println("  3. Insertion sort");
            System.out.println("  4. Search");
            System.out.println("  0. Exit\n");
            System.out.print("  Your selection (0 -> 4): ");
            choice = s.nextInt();
            if (choice == 0) {
                System.out.println(" Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1:
                    t.display(a);
                    break;
                case 2:
                    t.selectionSort(a);
                    break;
                case 3:
                    t.insertionSort(a);
                    break;
                case 4:
                    System.out.println(t.Search(a, 10) + " ");
                    break;
                default:
                    System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
}
