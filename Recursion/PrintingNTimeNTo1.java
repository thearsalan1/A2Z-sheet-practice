package Recursion;

import java.util.Scanner;

public class PrintingNTimeNTo1 {
    public  static void PrintNTimesNto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNTimesNto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till want to print: ");
        int n = sc.nextInt();
        PrintNTimesNto1(n);
    }
}
