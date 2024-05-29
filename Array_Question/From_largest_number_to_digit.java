/*
 * Question :: 
 *  Given an array of numbers form 0 to 9 of size N. 
 * Your task is to rearrange elements of the array 
 * such that after combining all the elements of the 
 * array number formed is maximum.
 * 
 * Example::
 *  Input:
    N = 5
    A[] = {9, 0, 1, 3, 0}
    Output:
    93100
    Explanation:
    Largest number is 93100 which
    can be formed from array digits.
 * 
 */

import java.util.Arrays;

public class From_largest_number_to_digit {
    public static void main(String[] args) {
        long [] array = {9,0,1,3,0};
        System.out.println(maxNumber(array,  5));
    }

    public static String maxNumber(long[] arr, long n) {
        Arrays.sort(arr); // sort the array
        StringBuilder sb = new StringBuilder(); // creating the string builder...
         
        for(int i= arr.length - 1; i >= 0; i--) { // traverse the array from the right to left
            sb.append(arr[i]); // add a value to current element sequence..
        } 
        return sb.toString();// Return the sb with to string method...
    }
}

/*
 * 
 * Time com:: O(n)
 * Space Complexity O(1)
 */