package Week1;

public class GCD {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        while(num1 > 0){
            int temp = num2 % num1;
            num2 = num1;
            num1 = temp;
        }
        System.out.println(num2);
    }
}
