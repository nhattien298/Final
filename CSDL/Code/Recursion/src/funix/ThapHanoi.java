package funix;

public class ThapHanoi {
    public static void towerOfHanoi(int n, char nguon, char dich, char trungGian){
        if(n ==1){
            System.out.println("di chuyen dia 1 tu nguon "+ nguon + " den cot " + dich);
            return;
        }else{
            towerOfHanoi(n-1, nguon, trungGian,dich);
            System.out.println("di chuyen dia "+ n+ " tu cot "+ nguon + " den cot " + dich);
            towerOfHanoi(n-1, trungGian,dich,nguon);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'a','b','c');
    }
}
