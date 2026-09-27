package Array;

public class LinearSearch {
    public static void LinearSearch(int[] arr,int t){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == t){
                System.out.println("Element found on index: "+i+ " element: "+arr[i]);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        LinearSearch(arr,6);
    }
}
