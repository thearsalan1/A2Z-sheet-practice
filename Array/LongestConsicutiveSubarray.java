package Array;

import java.util.Arrays;

public class LongestConsicutiveSubarray {
    public static void FindLongest(int[] arr){
        Arrays.sort(arr);
        int start=0;
        int end = 0;
        int maxCount =0;
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[i-1]+1){
                end++;
            }else{
                start = end = i;
            }
            maxCount = Math.max(maxCount,end-start+1);
        }
        System.out.println(maxCount);
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        FindLongest(arr);
    }
}
