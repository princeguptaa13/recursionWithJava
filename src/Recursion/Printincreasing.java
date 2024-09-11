package Recursion;

import java.util.Scanner;

public class Printincreasing {
    static void printingnaturalno(int n){
      if(n == 1) {
          System.out.print(n);
          return ;
      }
        printingnaturalno(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        printingnaturalno(n);

    }
}
