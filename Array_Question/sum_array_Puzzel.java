/*
 * Question ::
 * Given an array A of size N, 
 * construct a Sum Array S(of same size) such that 
 * S is equal to the sum of all the elements of A except A[i]. 
 * Your task is to complete the function SumArray(A, N) 
 * which accepts the array A and N(size of array).
 * 
 * Example:: 
 * Input:
    5
    3 6 4 8 9
    Output: 27 24 26 22 21
    Explanation: For the sum array S, at i=0 we
    have 6+4+8+9. At i=1, 3+4+8+9. At i=2, we 
    have 3+6+8+9. At i=3, we have 3+6+4+9. At
    i = 4, we have 3+6+4+8. So S is 27 24 26 22 21.
 * 
 */

public class sum_array_Puzzel {
    public static void main(String[] args) {
        int [] array = {3,6,4,8,9};
        SumArray(array, 5);

        for(int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void SumArray(int arr[], int n) {
        int sum = 0; // initilize the sum = 0;

        for(int i=0; i < arr.length; i++) { // traverse the loop and, 
            sum += arr[i]; // adding all elementof the sum and update the current element to the sum..
        }

        for(int i=0; i < arr.length; i++) { // again traverse the loop 
            arr[i] = sum - arr[i]; // update the current element to the sum minus current element..
        }
    }
}

/*
 *  Time Complexity: O(n)
    Space Complexity: O(1)
 */
