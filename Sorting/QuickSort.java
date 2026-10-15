package Sorting;

public class QuickSort {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int partition (int[] a,int low,int high){
        int pivot = a[low];
        int i=low;
        int j =high;
        while (i < j){
            while(i <= high - 1 && a[i] <= pivot){
                i++;
            }
            while(j >= low + 1 && a[j] > pivot){
                j--;
            }
            if(i<j){
                swap(a, i, j);
            }
        }
        swap(a, low, j);
        return j;
    }
    public static void qs(int[] a ,int low,int high){
        if(low<high){
            int pIdx = partition(a,low,high);
            qs(a,low,pIdx-1);
            qs(a,pIdx+1,high);
        }
    }
    public static int[] sortArray(int[] nums) {
        qs( nums, 0, nums.length-1);
        return nums;
    }

    public static   void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        sortArray(arr);
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}
