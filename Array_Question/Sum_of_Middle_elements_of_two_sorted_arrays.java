import java.util.ArrayList;

public class Sum_of_Middle_elements_of_two_sorted_arrays {
    public static void main(String[] args) {
        
    }

      public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // Initialize an empty ArrayList to store the merged elements
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0;  // Pointer for arr1
        int j = 0;  // Pointer for arr2
        int n = arr1.length;  // Length of arr1
        int m = arr2.length;  // Length of arr2

        // Merge the two sorted arrays into the list
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j])
                list.add(arr1[i++]);  // Add element from arr1 if it's smaller or equal
            else
                list.add(arr2[j++]);  // Add element from arr2 if it's smaller
        }

        // If there are remaining elements in arr1, add them to the list
        while (i < n) {
            list.add(arr1[i++]);
        }

        // If there are remaining elements in arr2, add them to the list
        while (j < m) {
            list.add(arr2[j++]);
        }

        int sum = n + m;  // Total number of elements in the merged list
        int mid = sum / 2;  // Middle index for even-sized list
        
        // Return the sum of the two middle elements
        return (list.get(mid - 1) + list.get(mid));
    }
}

/*
 * Time Complexity:
 * - The merging of two arrays takes O(n + m) time, where n is the length of arr1 and m is the length of arr2.
 * - Accessing elements from the list takes O(1) time.
 * - Overall, the time complexity is O(n + m).
 *
 * Space Complexity:
 * - The space complexity is O(n + m) due to the additional space required to store the merged elements in the ArrayList.
 * - The algorithm uses extra space proportional to the total number of elements in both input arrays.
 */

