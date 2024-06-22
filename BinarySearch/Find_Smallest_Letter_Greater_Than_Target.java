/*
 * Leetcode..
 * 
 * You are given an array of characters letters that is sorted 
 * in non-decreasing order, and a character target. 
 * There are at least two different characters in letters.

    Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

    Example 1:

    Input: letters = ["c","f","j"], target = "a"
    Output: "c"
    Explanation: The smallest character that is lexicographically 
    greater than 'a' in letters is 'c'.
 * 
 */


package BinarySearch;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char [] input = {'c','f','j'};
        System.out.println(nextGreatestLetter(input, 'f'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        // This checks if the target character is greater than or equal to the last character 
        // in the letters array. If it is, the next greatest letter would be 
        // the first letter in the array (since the array is assumed 
        // to be circular and sorted). This is an O(1) operation.
        if(target >= letters[letters.length - 1])
            return letters[0];

        // Initializes low to 0 and high to the length of the array. 
        // Note that high is set to letters.length, not letters.length - 1. 
        // This is important for the while loop condition and the final return statement.
        int low = 0;
        int high = letters.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return letters[low];
    }
}

/*
 * Time Complexity: O(log n)
   Space Complexity: O(1)
 */