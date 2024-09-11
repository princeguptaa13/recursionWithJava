package Recursion;

import java.util.Scanner;

public class sumofnumbers {
    static int printsum(int n){
        //BaseCase
        if(n < 10) return n ;

        //subProgram + subWork
        int sum = printsum(n/10)+printsum(n%10);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print("sum is = ");
        System.out.print(printsum(n));
    }
}
