package Strings;


import java.util.Scanner;

public class uppertolower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("pHySicS");
        for (int i = 0; i < str.length(); i++) {
          if ((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){//uppercase
              int value=(int)str.charAt(i)+32;
              str.setCharAt(i,(char)value);
          }
         else if((int)str.charAt(i)>=96 && (int)str.charAt(i)<=122){//lowercase
              int value = (int)str.charAt(i)-32;
              str.setCharAt(i,(char)value);
          }
        }
        System.out.println(str);
    }
}
