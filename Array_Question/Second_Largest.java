/*
 * Given an array Arr of size N, 
 * print the second largest distinct element from an array. 
 * If the second largest element doesn't exist then return -1.
 * 
 * Example 1:

    Input: 
    N = 6
    Arr[] = {12, 35, 1, 10, 34, 1}
    Output: 34
    Explanation: The largest element of the 
    array is 35 and the second largest element
    is 34.
 */

public class Second_Largest {
    public static void main(String[] args) {
        int [] array = {12,35,1,10,1};
        System.out.println(print2largest(array, 5));
    }

   public static int print2largest(int arr[], int n) {
        int largest = Integer.MIN_VALUE; // initilize largest
        int secondLargest = Integer.MIN_VALUE; // initilize secondLargest

        for(int i=0; i < n; i++) { // traverse the loop
            if(arr[i] > largest) { // if curret element is grater then largest
                secondLargest = largest; // update secondLargest As a largest
                largest = arr[i]; // largest element set as a current element..
            } else { // otherwise..
                if(arr[i] > secondLargest && arr[i] < largest) { // otherwise it meet both condition
                    secondLargest = arr[i]; // update secondLargest as a current element..
                }
            }
        }
        if(secondLargest == Integer.MIN_VALUE) { // or secondLargest is euqa the Min value
            return -1; // return -1..
        }
        return secondLargest; // finally return secondlargest..
    }
}

/*
 * Time Complexity :: O(n)..
 * Space Complexity :: O(1)..
 */
