package Recursion;

import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int sum=Sum(n);
        System.out.println(sum);
    }
}
