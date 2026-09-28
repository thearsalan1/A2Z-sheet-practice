package Array;

public class SortArrayOF0_1_2 {
//    Using Dutch flag algo
    public static  int[] Sol(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] ==1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high --;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,2,1,0,0};
        Sol(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
