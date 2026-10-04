package Strings;

public class CheckIsPalindrome {
    public static void CheckPalindrome (String s){
        int start = 0 ;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("String is not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("String is palindrome");
    }
    public static void main(String[] args) {
        String s = "malayalam";
        CheckPalindrome(s);
    }
}
