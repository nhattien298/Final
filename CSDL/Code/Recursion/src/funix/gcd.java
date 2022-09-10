package funix;

public class gcd {
    public static int gbc(int a, int b){
        if(b ==0){ return a;}
        return gbc(b,a%b);
    }

    public static void main(String[] args) {
        int c = gbc(6,189);
        System.out.println(c);
    }
}
