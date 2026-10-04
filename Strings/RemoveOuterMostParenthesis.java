package Strings;

public class RemoveOuterMostParenthesis {
    public  static  void removeOuter(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(c == '('){
                if(count > 0 ){
                    sb.append(c);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    sb.append(c);
                }
            }
        }
        sb.toString();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        removeOuter(s);
    }
}
