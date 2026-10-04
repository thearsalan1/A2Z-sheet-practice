package Array;

public class longestSubWithSum0 {
    public static void LSWS0(int[] arr){
        int start = 0;
        int maxLen=0;
        int sum=0;
        for (int end = 0; end < arr.length; end++) {
            sum+=arr[end];
            while(sum>0){
                sum-=arr[start];
                start++;
            }
            if(sum==0){
                maxLen = Math.max(maxLen,end-start+1);
            }
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr ={-2, 2, -8, 1, 7 };
        LSWS0(arr);
    }
}
