package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int fibonacciofnumber(int n){
        if(n==0) return 0 ;
        if(n==1) return 1 ;
        int fibo = fibonacciofnumber(n-1) + fibonacciofnumber(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value to find fibonacci = ");
        int n = sc.nextInt();
        System.out.println(fibonacciofnumber(n));
    }
}
