package Array;

public class NextPermutation {
    public static void NextPer(int[] arr){
        int n = arr.length;
        int pIdx = -1;

        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pIdx = i;
                break;
            }
        }

        if(pIdx == -1){
            reverse(arr, 0, n-1);
        } else {
            for(int i = n-1; i > pIdx; i--){
                if(arr[i] > arr[pIdx]){
                    int temp = arr[i];
                    arr[i] = arr[pIdx];
                    arr[pIdx] = temp;
                    break;
                }
            }

            reverse(arr, pIdx+1, n-1);
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr ,int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        NextPer(arr);
    }
}
