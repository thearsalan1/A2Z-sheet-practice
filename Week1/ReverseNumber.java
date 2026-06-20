package Week1;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = -12304;
        int lastDigit = 0;
        int reverse=0;
        boolean neg = false;
        if(num <0){
            neg = true;
            num = -num;
        }
        while(num!=0){
            lastDigit = num %10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        if(neg){
            reverse = - reverse;
        }
        System.out.println(reverse);
    }
}
