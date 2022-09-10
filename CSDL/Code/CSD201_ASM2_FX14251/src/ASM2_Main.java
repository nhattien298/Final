
import java.util.Scanner;

public class ASM2_Main {
// Khoi tao cac kieu du lieu
    public static MyList<Product> list = new MyList();
    public static MyStack<Product> stack = new MyStack<>();
    public static MyQueue<Product> queue = new MyQueue<>();
    public static Scanner sc = new Scanner(System.in);
// ham chay chuong trinh
    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
//menu
    public static void menu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("    Choose one of this options:");
        System.out.println("    Product list:");
        System.out.println("    1. Load data from file and display");
        System.out.println("    2. Input & add to the end.");
        System.out.println("    3. Display data");
        System.out.println("    4. Save product list to file.");
        System.out.println("    5. Search by bar code");
        System.out.println("    6. Delete by bar code");
        System.out.println("    7. Sort by bar code");
        System.out.println("    8. Convert to Binary");
        System.out.println("    9. Load to stack and display");
        System.out.println("    10. Load to queue and display.");
        System.out.println("    0. Exit");
        System.out.println("----------------------------------------------------------------");
        System.out.print("  Your choice (0-10): ");
        String choice = sc.next();
        switch (Integer.parseInt(choice)) {
            case 1:
                list = OperationToProduct.readToList();
                System.out.printf("%-15s | %-15s | %-15s | %-15s\n", "Bar code","Title","Quantity","Price");
                list.display(list);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 2:
                OperationToProduct.addProduct(list);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 3:
                System.out.printf("%-15s | %-15s | %-15s | %-10s\n", "Bar code","Title","Quantity","Price");
                list.display(list);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 4:
                OperationToProduct.writeToFile("data.txt", list);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 5:
                System.out.print("Input Bar code to search ");
                String inputBcode = sc.next();
                Node findedNode = OperationToProduct.findProduct(list, inputBcode);
                if (findedNode != null) {
                    findedNode.displayNode(findedNode);
                } else {
                    System.out.print("Not found!!!");
                }
                System.out.println();
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 6:
                System.out.print("Input Bar code to delete ");
                String delID = sc.next();
                list.delNodeByBcode(list, delID);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 7:
                list.SortList(list);
                System.out.printf("%-15s | %-15s | %-15s | %-15s\n", "Bar code","Title","Quantity","Price");
                list.display(list);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 8:
                int number = list.getHead().getData().getQuantity();
                if (number < 0) {
                    System.out.print(" Nhap so lon hon 0");
                } else {
                    System.out.println("So thap phan " + number + " sau khi chuyen doi: ");
                    OperationToProduct.convertToBinary(number);
                }
                System.out.println();
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 9:
                stack = OperationToProduct.readToStack();
                stack.displayStack(stack);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 10:
                queue = OperationToProduct.readToQueue();
                queue.display(queue);
                System.out.println();
                System.out.println("Successfully!");
                System.out.println();
                break;
            case 0:
                System.out.println("GoodBye!!!!");
                System.exit(0);
            default:
                System.out.println("Your choice is not available");
        }
    }
}
