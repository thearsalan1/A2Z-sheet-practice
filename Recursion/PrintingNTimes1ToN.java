package Recursion;

import java.util.Scanner;

public class PrintingNTimes1ToN {
    public static void printNTimes(int n){
        if(n==0){
            return;
        }
        printNTimes(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNTimes(n);
        sc.close();
    }
}
