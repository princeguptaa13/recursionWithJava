package Recursion;

import java.util.Scanner;

public class alternatesums {
    static int printseries(int n){
       //base case
        if(n == 0) return 0;

       //Recursive case
       else if (n%2 != 0) {
            return printseries(n - 1) + n;
        }
       else if(n%2 == 0){
           return  printseries(n - 1) - n;
}
       else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. for series = ");
        int n = sc.nextInt();
        System.out.println(printseries(n));
    }
}
