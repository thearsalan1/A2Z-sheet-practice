package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeader {
    public static void FindLeader(int[] arr){
        int n = arr.length;
        int Leader=arr[n-1];
        List<Integer> leaders = new ArrayList<>();
        leaders.add(Leader);
        for(int i = n-1 ; i >=0 ; i--){
            if (arr[i] > Leader){
                leaders.add(arr[i]);
                Leader=arr[i];
            }
        }
        Collections.reverse(leaders);
        for(int l : leaders){
            System.out.print(l+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        FindLeader(arr);
    }
}
