package Recursion;

import java.util.Scanner;

public class factorial {
    static int factotialclass(int n) {
        if(n==0) return 1 ;
        return  n * factotialclass(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the recursive no.= ");
        int n = sc.nextInt();

        System.out.println(factotialclass(n));
    }
}
