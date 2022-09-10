package sort;

import java.util.Arrays;

import static sort.Algorithm.convertArrayToString;

public class test {
    public static void main(String[] args) {
        float[] arr = {1,1,1,1,1, 2,2,2,2,2, 3, 4, 5, 6, 7, 7, 7, 8, 9};
        System.out.println(binarySearch(arr, 0));
    }

    public static int binarySearch(float[] arr, float value) {
        int mid = -1;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        while (high >= low) {
            System.out.println("low = "+ low);
            System.out.println("hight = "+ high);
            System.out.println(" so sanh hight va low "+ high +" vs "+ low);
            System.out.println();
            mid = (low + high) / 2;
            System.out.println("index mid là : "+ mid);
            System.out.println("gia tri arr[mid] : "+ arr[mid]);
            System.out.println(" so sanh arr[mid] voi value "+ value + " ? "+ arr[mid]);
            if (value < arr[mid]) { // value nam ben trai
                System.out.println("giá trị cần tiềm kiếm nằm bên tay trái của mảng rồi : ");
                high = mid - 1;
            } else if ((value == arr[mid])) {
                System.out.println("2 thằng bằng nhau nè ");
                if(mid ==0){
                    System.out.println(" index = 0 rồi, trường hợp đặc biệt nhé");
                    return mid;
                }else if (arr[mid] != arr[mid - 1]) {
                    System.out.println("bước 1");
                    return mid;
                } else {
                    System.out.println(" bằng nhau nhưng vị trí index kế bên  nó giống nhau nên --------->");
                    high = mid - 1;
                }
            } else { // x nam ben phai
                System.out.println("nằm bên phải mảng rồi");
                low = mid + 1;
            }
        }
        System.out.println("khong co trong mang nha");
        return -1;
    }
}
