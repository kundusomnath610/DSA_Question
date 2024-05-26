/* Qusetion ::
 * Given an array of N positive integers where all numbers occur even number of times except 
 * one number which occurs odd number of times. 
 * Find the exceptional number.
 * 
 * Input Array is {1,2,3,2,3,1,3} And Size is N = 7..
 */

public class Exceptionally_Odd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,3,1,3};
        System.out.println(getOddOccurrence(arr, 7));
    }

    public static int getOddOccurrence(int[] arr, int n) {
         // Initialize oddCount to 0
         int oddCount = 0;
        
         // Loop through each element in the array
         for(int num : arr) {
             // XOR operation (^) with oddCount and current element
             // XOR of two equal numbers results in 0, so even occurrences cancel out
             // XOR of 0 with a number gives the number itself
             // As a result, after looping through all elements, oddCount will contain
             // the value of the element occurring odd number of times
             oddCount = oddCount ^ num;
            }
         
         // Return the element occurring odd number of times
         return oddCount;
    }
}

/*
 * 1. Time Complexity: 
 * The code iterates through the array once, performing a constant-time operation (bitwise XOR) 
 * for each element.
   Therefore, the time complexity is O(n), where n is the number of elements in the array.

  2.Space Complexity:
    The code uses a single integer variable (oddCount) to store the result.
    Additionally, it doesn't use any auxiliary data structures that grow with the input size.
    Therefore, the space complexity is O(1), indicating constant space complexity.
 * 
 */