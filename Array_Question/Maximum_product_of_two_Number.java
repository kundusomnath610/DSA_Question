/* 
 *   Question:: 
 * Given an array Arr of size N with all elements greater 
 * than or equal to zero. 
 * Return the maximum product of two numbers possible.
 * 
 * input array :: {1,4,3,6,7,0}
 * maximum number of array is :- 7
 * minimum number of array is :- 6
 * product of array is 7 * 6 = 42..
 * 
 */


public class Maximum_product_of_two_Number {
    public static void main(String[] args) {
        int [] arr = {1,4,3,6,7,0};
        System.out.println(maxProduct(arr, 5));
    }
    public static int maxProduct(int arr[], int n) {
        // Initialize variables to store the maximum and second maximum values
        int max = 0;
        int second_max = 0;

    // Loop through the array
    for(int i = 0; i < n; i++) {
        // If the current element is greater than the second maximum

    if(arr[i] > second_max) {
        // Update max with the previous second maximum
        max = second_max;
        // Update second_max with the current element
        second_max = arr[i];
    }
    // If the current element is greater than max but not second_max
    else if(arr[i] > max) 
    // Update max with the current element
        max = arr[i];
    }
        // Return the product of the largest and second-largest elements
        return max * second_max;
    }
}

/*
 * Time Complexity :: - O(n)
 * Space Complexity :: - O(1)
 */