public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int val:nums2
             ) {
            chenPhanTuVaoMang(val, nums1, m);
            m++;
        }
    }

    private void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timduock = false;
        for (int k = 0; k < a.length; k++) {
            if(a[k]> x){
                timduock = true; // xac dinh duoc vi tri index k ma tai do gia tri a[k]> x. luc do ta se dich chuyen tat ca cac index sau k ve ben phai 1 don vi de co khoang trong
                for(int l = m-1; l>=k; l--){// dich phan tu cuoi cung xuong 1 don vi index
                    a[l+1]= a[l]; // chuyen gia tri tai index l thut lui ve 1 don vi ;
                }
                a[k] = x; // sau khi dich chuyen het cac gia tri sau index k sang phai 1 don vi thi co 1 cho trong de chen x.
                break;
            }
        }
        if(timduock == false){ // trong truong hop  khong tim duoc vi tri index k thi se chen x vao vi tri a[m ] luon/ vi luc do x > a[k] roi.
            a[m] = x;
        }
    }
}
