/*
 * Question ::
 *  Pitsy needs help with the given task by her teacher. 
 * The task is to divide an array into two sub-array (left and right) 
 * containing n/2 elements each and do the sum of the subarrays 
 * and then multiply both the subarrays.

    Note: If the length of the array is odd then the 
    right half will contain one element more than the left half.

   Example::
    Input : arr[ ] = {1, 2, 3, 4}
    Output : 21
    Explanation:
    Sum up an array from index 0 to 1 = 3
    Sum up an array from index 2 to 3 = 7
    Their multiplication is 21.

 */

public class Multiply_left_and_right_array_sum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(multiply(arr, 4));
    }
    public static int multiply (int arr[], int n) {
        int temp = 0; // initilize temp variable..

        // Travese the loop till half of the array (n/2)...
        for(int i = 0; i < n/2; i++) { 
            temp = temp+arr[i]; // Then add the array element and store the array in temp...
        }

        int sum = 0; // initilize sum for another half array..
        // j start from the rest of the half the array...  
        for(int j = n/2; j < n; j++) {
            sum = sum + arr[j]; // add the array and store in the sum variable....
        }
        return temp * sum; // then return the multilply of temp and sum .....
    }
}

/*
 * Time Complexity :: O(n)
 * Space Complexity :: O(1)
 */
