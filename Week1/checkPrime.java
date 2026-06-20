package Week1;

public class checkPrime {
    public static void main(String[] args) {
        int num = 30;
        for(int i =2 ; i*i <= num ; i++){
            if(num%i==0){
                System.out.println("number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
