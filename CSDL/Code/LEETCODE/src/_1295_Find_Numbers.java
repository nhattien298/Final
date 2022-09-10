public class _1295_Find_Numbers {
    public int demSoLuong(int a){
        int count = 0;
        while(a != 0){
            count+=1;
            a= a/10;
        }
        return count ;
    }
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(demSoLuong(nums[i])%2 ==0){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        _1295_Find_Numbers numbers = new _1295_Find_Numbers();
        int b =  numbers.demSoLuong(14569897);
        System.out.println(b);
        int [] nums = {12,345,2,6,7896};
        int c = numbers.findNumbers(nums);
        System.out.println("-----> "+ c);
    }
}
