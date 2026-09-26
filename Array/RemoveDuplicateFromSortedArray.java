package Array;

public class RemoveDuplicateFromSortedArray {
    public static int UsingArray (int[] arr) {
        int start=0;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[start] != arr[i]){
                arr[start+1] = arr[i];
                start++;
            }
        }
        return start+1;
    }
    public static int UsingTwoPointer(int[] arr){
        int slow =0 ;
        int fast = 1;
        while (fast <arr.length){
            if(arr[slow] != arr[fast]){
                arr[slow+1] =arr[fast];
                slow ++;
            }
                fast++;
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6};
        int newLength =UsingTwoPointer(arr);
        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }
    }
}
