package Array;

public class SubArraysWithGivenSum {
    public static void SAWGS(int[] arr, int k){
        int sum=0;
        int start=0;
        int freq=0;
        for(int end = 0 ; end < arr.length ; end++){
                sum += arr[end];
            while(sum>k){
                sum-=arr[start];
                start++;
            }
            if(sum == k){
                freq++;
            }
        }
        System.out.print("Number of subarrays with given sum are: "+freq);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        SAWGS(arr,k);
    }
}
