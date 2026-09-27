package Array;

public class FindUnion {
    public static void findUnion(int[] a1, int[] a2){
        int[] a3 = new int[a1.length+a2.length];
        int idx=0;
        for(int i = 0 ; i< a1.length ; i++){
            a3[i] = a1[i];
            idx++;
        }
        for (int i = 0; i< a2.length; i++){
            boolean found = false;
            for (int j= 0 ;j<idx; j++){
                if(a2[i] == a3[j]){
                    found =true;
                    break;
                }
            }
            if(!found){
                a3[idx++] = a2[i];
            }
        }
        for(int i = 0 ;  i<idx ; i++){
            System.out.print(a3[i]+" , ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        findUnion(arr1,arr2);
    }
}
