/*
 * Quetion ::
 *  You are given an array Arr of size N. 
 *  Find the sum of distinct elements in an array.
 * 
 * Example 1 :: 
 *  Input:
    N = 5
    Arr[] = {1, 2, 3, 4, 5}
    Output: 15
    Explanation: Distinct elements are 1, 2, 3, 4, 5.
    So sum is 15. -> 1+2+3+4+5 = 15..
 * 
 */

import java.util.Arrays;
public class Sum_of_distinc_number {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(findSum(array, 5));
    }
    public static int findSum(int arr[], int n) {
        Arrays.sort(arr);// sort the array
        
        int sum = arr[0]; // initilize the array elemnt zero ...
        for(int i=1; i < n; i++) { // itarate the loop from 1st index..
           if(arr[i] != arr[i - 1]) // check if condition the current element and previous element of array not match then it's unique
            sum+= arr[i]; // then add both element and store the sum variable as a current element...
        }
        return sum; // finaily return the sum...
    }
}

