/*
* Input:
    N = 3 
    A[] = {3, 1, 1}
    B[] = {6, 5, 4}

    Output:
    23 

    Explanation:
    1*6+1*5+3*4 = 6+5+12
    = 23 is the minimum sum
 */


import java.util.Arrays;

public class Minimize_The_Sum_of_Product {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 4}; 
        int[] array2 = {5, 6, 7, 9}; 
        // Store the static (minValue and perameter) method in a variable result.. 
        long result = minValue(array1, array2, array1.length);
        // Print the result ...
        System.out.println("The minimized sum of products is: " + result);
    }

    // Function to reverse an array
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp;

        // Swap elements from start and end moving towards the center
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // Function to compute the minimized sum of products of elements of two arrays
    public static long minValue(int[] a, int[] b, int n) {
        // Sort the first array in ascending order
        Arrays.sort(a);
        // Sort the second array in ascending order
        Arrays.sort(b);
        // Reverse the second array to make it in descending order
        reverse(b);
        
        long sum = 0;
        
        // Calculate the sum of products of corresponding elements
        for (int i = 0; i < n; i++) {
            sum += (long) a[i] * b[i]; // Cast to long to avoid integer overflow
        }
        
        return sum;
    }
}


/*
 * 
 * 1 4 3 4 == 1 3 4 4 == 9 + 21 + 24 + 20 == 74
   5 6 7 9 == 9 7 6 5
 * 
 */
