package Recursion;

public class printnumberarray {

     static void printarray(int[] arr , int idx){
         //base case
         int n = arr.length;
         if(idx == n) return ;


         //Self work
         System.out.println(arr[idx]);


         //Sub problem
         printarray(arr , idx+1);

    }
    public static void main(String[] args) {
        int [] arr ={2,4,15,3,7,9};

        printarray(arr , 0);
    }
}
