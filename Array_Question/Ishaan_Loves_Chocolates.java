/*
 * Qustion ::
 * As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. 
 * Each of the squares has a tastiness level which is denoted by an array A[].
   Ishaan can eat the first or the last square of the chocolate at once. 
   Ishaan has a sister who loves chocolates too and she demands the last chocolate square.
   Now, Ishaan being greedy eats the more tasty square first. 
   Determine the tastiness level of the square which his sister gets.

    Example 1 ::
        Input : arr[ ] = {5, 3, 1, 6, 9}
        Output : 1
        Explanation:
        Initially: 5 3 1 6 9
        In first step: 5 3 1 6
        In Second step: 5 3 1
        In Third step: 3 1
        In Fourth step: 1
        Return 1

    Example 2 ::
        Input : arr[ ] = {5, 9, 2, 6} 
        Output :  2

 */


public class Ishaan_Loves_Chocolates {
    public static void main(String[] args) {
        int [] arr = {5, 9, 2, 6};
        System.out.println(chocolates(4, arr));
    }
    public static int chocolates(int n, int[] arr) {
        // Initialize low and high pointers
        int low = 0; // Points to the start of the array
        int high = n - 1; // Points to the end of the array
        
        // Loop until low pointer is less than high pointer
        while (low < high) {
            // If the number of chocolates at low index is greater than the number of chocolates at high index
            if (arr[low] > arr[high]) 
                low++;  // Move low pointer to the right
            else 
                high--; // Move high pointer to the left
        }
        
        // When low becomes equal to high, it points to the minimum number of chocolates
        return arr[low];
    }
}

/*
 *  Time Complexity::
    The code uses a while loop that iterates until the low pointer is less than the high pointer.
    In each iteration of the loop, either the low pointer is incremented or the high pointer is decremented, but not both.
    Therefore, the while loop iterates at most n/2 times (where n is the size of the array).
    Thus, the time complexity is O(n/2), which is essentially O(n), where n is the number of elements in the array.
    
    Space Complexity:
    The code uses a constant amount of additional space regardless of the input size.
    It only uses a few integer variables for pointers (low and high).
    Therefore, the space complexity is O(1), indicating constant space complexity.

    Overall::
    Time Complexity: O(n)
    Space Complexity: O(1)

 */
