package BinarySearch;

public class Minimum_Number_in_a_sorted_rotated_array {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,1,9};
        System.out.println(minNumber(array, 2, 1));
    }

    static int minNumber(int arr[], int low, int high) {
       // Initialize the low and high pointers for the binary search
        low = 0;
        high = arr.length - 1;

        // Continue the loop until the low pointer is less than the high pointer
        while (low < high) {
        // Calculate the mid index to split the array into two halves
        int mid = low + (high - low) / 2;

        // If the element at mid is less than the element at high,
        // it means the smallest element is in the left part of the array
        if (arr[mid] < arr[high]) {
        high = mid; // Update high to mid to search in the left half
    } else {
        // If the element at mid is greater than or equal to the element at high,
        // it means the smallest element is in the right part of the array
        low = mid + 1; // Update low to mid + 1 to search in the right half
    }
}

    // After the loop ends, low will be pointing to the smallest element
    return arr[low];

    }
}
