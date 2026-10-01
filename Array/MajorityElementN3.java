package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementN3 {
    public static void MajorEle(int[] arr){
        int n=arr.length;
        int candidate1 = 0 , candidate2 = 0;
        int count1 = 0 , count2 = 0;

        for(int num : arr){
            if(num == candidate1){
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1=num;
                count1++;
            }else if(count2 == 0){
                candidate2=num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
            count1=count2=0;
            for(int num : arr){
                if(num == candidate1) count1++;
                if (num == candidate2) count2++;
            }
        List<Integer>candidates = new ArrayList<>();
            if(count1>n/3) candidates.add(candidate1);
        if(count2>n/3) candidates.add(candidate2);
        System.out.println(candidates);
    }
    public static void main(String[] args) {
        int[] arr  = {1,1,1,3,3,2,2,2};
        MajorEle(arr);
    }
}
