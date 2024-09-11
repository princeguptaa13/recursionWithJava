package Recursion;

import java.util.Scanner;

public class GCD {
    static int iGCD(int x , int y){
        while(x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y ;
    }
    static int Euclidalgo(int x,int y){
        if( y ==  0){
            return x ;
        }
      return   Euclidalgo(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter divisor as x = ");
        int x = sc.nextInt();
        System.out.print("Enter dividend as y = ");
        int y = sc.nextInt();
        System.out.println(iGCD(x,y));
        System.out.println((Euclidalgo(x,y)));
    }
}

