package Array;

public class SpiralMatrix {
    public  static  void SpiralPrint(int[][] arr){
       int right = arr[0].length-1 , left = 0;
       int top = 0 , bottom = arr.length-1;

       while(top<=bottom && left<=right){

           for( int j = left; j <= right ; j++ ){
               System.out.print(arr[top][j]);
           }
               top++;

           for( int i= top ; i <= bottom ; i++){
               System.out.print(arr[i][right]);
           }
               right --;

           if(top <= bottom){
               for(int j = right ; j >= left ; j--){
                   System.out.print(arr[bottom][j]);
               }
                   bottom--;
           }

           if(left<=right){
               for (int i = bottom ; i >= top ; i-- ){
                   System.out.print(arr[i][left]);
               }
                   left++;
           }
       }

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        SpiralPrint(arr);
    }
}
