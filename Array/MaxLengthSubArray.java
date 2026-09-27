package Array;

public class MaxLengthSubArray {
    public static void LongestSubArray(int[] arr , int tar){
        int sum=0;
        int start=0;
        int end = 0;
        int MaxLength=0;
        while(end<arr.length){
            int currentWindow = 0;
            if(sum==tar){
                currentWindow=end-start;
                MaxLength= Math.max(MaxLength,currentWindow);
                sum-=arr[start];
                start++;
            } else if (start == end){
                sum+=arr[start];
                end++;
            } else if (sum > tar) {
                sum-=arr[start];
                start++;
            } else if (sum < tar) {
                sum+=arr[end];
                end++;
            }
        }
        System.out.println(MaxLength);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 1, 1, 2};
        int tar = 6;
        LongestSubArray(arr, tar);
    }
}
