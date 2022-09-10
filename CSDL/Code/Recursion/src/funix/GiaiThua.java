package funix;

public class GiaiThua {
    public static double factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static double tailRecursion(int n, int result) {
        if (n == 0) {
            return result;
        }
        return n * tailRecursion(n - 1, result);
    }

    public static void main(String[] args) {
        double b = factorial(1000);
        System.out.println(b);
        double l = tailRecursion(1000, 1);
        System.out.println(l);

    }
}
