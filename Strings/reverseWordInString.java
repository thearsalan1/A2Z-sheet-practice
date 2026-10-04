package Strings;

public class reverseWordInString {
    public static void reverse(String s){
        StringBuilder sb = new StringBuilder();
        int left = s.length()-1;
        int right = s.length()-1;
        while(left>=0){
            if(s.charAt(left) == ' ' || left == 0){
                sb.append(s,left,right+1);
                right=left;
                left--;
            }
            left--;
        }
        System.out.println(sb.toString());;
    }
    public static void main(String[] args) {
        String s = "boy! good a is Arsalan";
        reverse(s);
    }
}
