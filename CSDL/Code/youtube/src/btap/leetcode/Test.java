package btap.leetcode;

public class Test {
    public static void main(String[] args) {
        int i =245;
        int count = 1;
        int temp = i/10;
        while(temp !=0){
            count++;
            temp =temp/10;
        }
        System.out.println(count);
    }
}
