public class Count_odd_even {
    public static void main(String[] args) {
        // Define an array containing integers
        int[] array = {1, 2, 3, 4, 5};
        
        // Call the countOddEven method to count odd and even numbers in the array
        // and store the result in the counts array
        int[] counts = countOddEven(array, 5);
        
        // Print the count of odd numbers
        System.out.println("Odd numbers: " + counts[0]);
        
        // Print the count of even numbers
        System.out.println("Even numbers: " + counts[1]);
    }

    // Static Method to count the number of odd and even elements in an array
    public static int[] countOddEven(int[] arr, int n) {
        // Initialize an array to store counts of odd and even numbers
        int[] count = {0, 0};

        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is even
            if (arr[i] % 2 == 0)
                // If even, increment the count of even numbers
                count[1]++;
            else
                // If odd, increment the count of odd numbers
                count[0]++;
        }
        
        // Return the array containing counts of odd and even numbers
        return count;
    }
}

