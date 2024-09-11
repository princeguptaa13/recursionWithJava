package Recursion;

import java.util.*;
public class maxValue {
    static int printMaxValue(int[] arr , int idx){
        //base case
        if (idx == arr.length-1){
            return arr[idx]  ;
        }
        //self work
         int ans = printMaxValue(arr,idx+1);

        //sub problem
       return Math.max(ans,arr[idx]);

    }
    public static void main(String[] args) {
        int [] arr = {4, 2, 3, 1, 7 ,8, 32, 42 , 12};
        printMaxValue(arr , 0);
    }
}
