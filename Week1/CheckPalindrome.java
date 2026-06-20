package Week1;

public class CheckPalindrome {
    public static void main(String[] args) {
        int numb=1234321;
        int num = 121;
        int rev = 0;
        if(num<0){
            System.out.println("not palindrome");
        }
        while(num > 0){
            System.out.println("loop");
            int lastdigit = num%10;
            System.out.println(lastdigit);
            rev = rev * 10 + lastdigit;
            System.out.println(rev);
            num /= 10;
        }
        System.out.println(rev);
        System.out.println(num);
        if(numb == rev){
            System.out.println("number is palindrome: "+ rev + " = "+ numb);
        }
    }
}
