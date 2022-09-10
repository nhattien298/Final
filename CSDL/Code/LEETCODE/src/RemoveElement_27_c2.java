public class RemoveElement_27_c2 {
    // lam voi ky thuat 2 con tro
    public static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int k =0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!= val){
                nums[k]= nums[i];
                k++;
            }

        }
        return k;
    }
}
