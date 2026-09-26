package Array;

public class LargestElement {
    public static  void TwoPointerApp(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int max= Integer.MIN_VALUE;
        while(start<=end){
            max = Math.max(max,arr[start]);
            max= Math.max(max,arr[end]);
            start++;
            end--;
        }
        System.out.println(max);
    }
    public static  void UsingArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56, 91, 34};
        TwoPointerApp(arr);
        UsingArray(arr);
    }
}
