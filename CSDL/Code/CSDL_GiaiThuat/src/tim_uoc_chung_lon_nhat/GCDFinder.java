package tim_uoc_chung_lon_nhat;

public class GCDFinder {
    public static void main(String[] args) {
        System.out.println(gcd(9,3));
    }
    public static  int gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return gcd( b,a%b);
        }
    }
}
