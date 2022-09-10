package sap_xep;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(insertSort(a)));
    }

    public static int[] insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            System.out.println(" lan i "+ i);
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) { // xét điều kiện khi j >=0 và nếu giá trị ở ô a[j] lớn hơn giá trị a[i]
                System.out.println("lần j "+ j);
                a[j+1] = a[j]; //kéo vị trí qua bên phải 1 index
                j--;// tiếp tục trừ j thêm 1 đơn vị và bắt đầu lại vòng lăp while cho đến khi nào không thỏa điều kiện thì thôi.
            }
            a[j+1] = current; // vì j đã bị -- ở trước nên ta phải cộng 1 để trả về giá trị của j trước đó.
            System.out.println(Arrays.toString(a));
        }

        return a;
    }
}
