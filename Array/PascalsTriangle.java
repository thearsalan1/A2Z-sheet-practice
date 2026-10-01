package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> genratePascals(int n){
       List<List<Integer>> triangle = new ArrayList<>();

       for(int row = 0 ; row<n ; row ++){
           List<Integer>currRow = new ArrayList<>();
           currRow.add(1);
           for(int col = 1 ; col < row ; col++){
               int val = triangle.get(row-1).get(col-1) + triangle.get(row-1).get(col);
               currRow.add(val);
           }
           if(row>0){
               currRow.add(1);
           }
           triangle.add(currRow);
       }
       return triangle;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>>  result=genratePascals(n);
        for(List<Integer> list : result){
            System.out.println(list);
        }
    }
}
