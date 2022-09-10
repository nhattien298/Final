public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i]== val){
                // can phai xoa phan tu
                for (int j = i; j < n-1; j++) {
                    nums[j]= nums[j+1]; // dich chuyen sang trai 1 gia tri index
                }
                n--;
                i--;// sau khi xoa vi tri [i] thi cac index o sau se don len vi tri i lai, nen ta se phai tiep tuc xet lai o vi tri i lan nua. nhu vay neu ko phai xoa thi i van tang len , va nguoc lai
            }
        }
        return n;
    }
}
