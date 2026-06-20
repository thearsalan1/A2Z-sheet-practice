package Week1;

public class PrintAllDivisior {
    public static void main(String[] args) {
        int num = 20;
//        int x = 1;
//        while(x < num/2){
//            if(num%x==0){
//                System.out.println(x);
//            }
//            x++;
//        }
        for(int i = 1; i*i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
                if(i != num/i){
                    System.out.println(num/i);
                }
            }
        }
    }
}
