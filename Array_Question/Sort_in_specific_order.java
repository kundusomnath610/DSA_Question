/*
 * Qusetion::
 *  Given an array A of positive integers. 
 * Your task is to sort them in such a way 
 * that the first part of the array contains 
 * odd numbers sorted in descending order, 
 * rest portion contains even numbers sorted in ascending order.
 * 
 * Example 1::
 *  Input:
 *  N = 7
 *  Arr = {1, 2, 3, 5, 4, 7, 10}
 *  Output:
    7 5 3 1 2 4 10
    Explanation:
    Array elements 7 5 3 1 are odd
    and sorted in descending order,
    whereas 2 4 10 are even numbers
    and sorted in ascending order.
 * 
 */


public class Sort_in_specific_order {
    public static void main(String[] args) {
        long[] arr = {1,2,3,5,4,7,10};
        sortIt(arr, 7);
        for(long num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sortIt(long arr[], long n) {
        // Initialize a new array 'res' with the same length as 'arr'.
        long [] res = new long[arr.length];
        
        // Initialize an index 'j' to keep track of the position in the 'res' array.
        int j = 0;
        
        // Iterate through the sorted 'arr' array backwards.
        for(int i = arr.length - 1; i >= 0; i--) {
            // If the current element is odd, place it at index 'j' in 'res' and increment 'j'.
            if(arr[i] % 2 != 0) {
                res[j++] = arr[i];
            }
        }
        
        // Iterate through the 'arr' array from the beginning.
        for(int i = 0; i < arr.length; i++) {
            // If the current element is even, place it at the next available index 'j' in 'res' and increment 'j'.
            if(arr[i] % 2 == 0) {
                res[j++] = arr[i];
            }
        }
        
        // Copy the sorted elements from 'res' back to 'arr', preserving the first 'n' elements.
        for(int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
