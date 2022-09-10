package btap.leetcode;

public class FindNumberswithEvenNumberofDigits1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]/10 ==0){
                count++;
            }
            if (count%2==0){
                result++;
            }
            count =0;
        }
    return result;
    }

    public static void main(String[] args) {
        int[]arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));;
    }
}
