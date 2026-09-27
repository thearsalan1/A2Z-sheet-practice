package Array;

public class FindNoAppOnce {
    public static void FNAO(int[] arr) {
        int xor =0;
        for(int i: arr){
             xor ^= i;
        }
        System.out.println(xor);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        FNAO(arr);
    }
}
