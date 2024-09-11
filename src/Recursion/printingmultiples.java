package Recursion;

import java.util.*;

public class printingmultiples {
    static void multiples(int n , int k){
        //base case
        if(k == 0) return ;

        //recursive problem
        multiples(n,(k-1));
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your multiple no. = ");
        int n = sc.nextInt();
        System.out.print("Enter the number from where you have to find = ");
        int k = sc.nextInt();

     multiples(n,k);
    }
}
