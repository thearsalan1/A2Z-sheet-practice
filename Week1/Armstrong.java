package Week1;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int x=num;
        int res = 0;
        while(x!=0){
            int ld = x%10;
            res += ld*ld*ld;
            x/=10;
        }
        if(num == res){
            System.out.println("Number is armstrong: "+num+ " = "+ res);
        }
        System.out.println("Not");
    }
}
