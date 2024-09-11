package Strings;

import java.util.Scanner;


public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder( "heelo");
        //str = "helloWorld";
        str.append("ok");
        str.setCharAt(3,'y');
        System.out.println(str);

    }
}

