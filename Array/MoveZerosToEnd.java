package Array;

public class MoveZerosToEnd {
    public static void MoveZeroToEnd(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            if(arr[end] == 0){
                end--;
            }else if(arr[start] != 0){
                start++;
            }else{
                int temp=arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,4,5};
        MoveZeroToEnd(arr);
    }
}
