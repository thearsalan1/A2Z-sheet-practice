package Array;

public class LeftRotateBy1 {
    public  static void UsingArray (int[] arr) {
        int lastVal = arr[arr.length-1];
        for (int i =arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastVal;
        for(int i : arr){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        UsingArray(arr);
    }
}
