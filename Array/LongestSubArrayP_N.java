package Array;

public class LongestSubArrayP_N {
    public static void Function(int[] arr, int k){
        int n = arr.length;
        int maxLen= 0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+= arr[i];
                if(sum==k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        Function(arr,k);
    }
}
