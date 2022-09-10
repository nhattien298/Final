package tim_uoc_chung_lon_nhat;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        System.out.println(GCD(5,3));;
    }

    public static int GCD(int a, int b) {
        int max = 0;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (max < i) {
                        max = i;
                    }
                }
            }

        } else if (a == b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (max < i) {
                        max = i;
                    }
                }
            }
        }
        else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (max < i) {
                        max = i;
                    }
                }
            }

        }
    return  max;

    }
}
