package BinarySearch;

import java.util.Scanner;

public class BinarySearching { public static void main(String[] args) {

    System.out.print("Input target element: ");
    Scanner in = new Scanner(System.in);
    int target = in.nextInt();

    int[] arr = {1,2,3,3,4,5,6,7,8,9,11,13,15,16};
    int ans = binarysearch(arr , target);

    if(ans == -1){
        System.out.println("Target not found");
    } else {
        System.out.println(" Target Found!! Index no.: " + ans);
    }

}

static int binarysearch(int[] arr, int target){
    
    int start = 0;
    int end = arr.length - 1;

    while(start<=end){

        int mid = start + (end - start)/ 2;

        if ( target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }


    }

    return -1;
}
}
