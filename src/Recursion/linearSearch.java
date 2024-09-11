package Recursion;
public class linearSearch {
    static boolean searchLinear(int[] arr,int n ,int target, int idx) {
        //Base Case
        if (idx >= n) return false ;


        //self work
        if (arr[idx] == target) return true;


        //recursive work
        if (searchLinear(arr, n, target, idx + 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 5, 17, 43, 11, 2};
        int target = 11 ;
        int  n = arr.length ;
        if (searchLinear(arr,n, target, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

