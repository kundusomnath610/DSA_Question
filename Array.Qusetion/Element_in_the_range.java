/*
 * Question ::
 *      Given an array arr[] containing positive elements. 
 *      A and B are two numbers defining a range. 
 *      The task is to check if the array contains all elements in the given range.
 * 
 *  input array :: Example 1..
 *      Input: N = 7, A = 2, B = 5
        arr[] =  {1, 4, 5, 2, 7, 8, 3}
        Output: Yes
        Explanation: It has elements between 
        range 2-5 i.e 2,3,4,5


    input array:: Example 2
        Input: N = 7, A = 2, B = 6
        arr[] = {1, 4, 5, 2, 7, 8, 3}
        Output: No
        Explanation: Array does not contain 6.
        

 */


import java.util.Set;
import java.util.HashSet;

public class Element_in_the_range {
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 2, 7, 8, 3}; // initialize the array element...
        System.out.println(check_elements(arr, 7, 2, 5)); // print the array...
    }
    public static boolean check_elements(int arr[], int n, int A, int B) {
        Set<Integer> set = new HashSet<>(); // create a set for store the element...

        for(int i=0; i < n; i++) { // traverse the array...
            set.add(arr[i]); // And add Element in the set based on array index...
        }
        // then travese the array form target element to lessthen or equal 
        //to another target element..
        for(int i=A; i <= B; i++) {  
            if(!set.contains(i)) // if not found the element in the array ...
                return false; // return false...
        }
        return true; // otherwise return true...
    }
}

/*
 * Time Complexity:: O(n logn)
 * Space Complexity:: O(max_element)
 */