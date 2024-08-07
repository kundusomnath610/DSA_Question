/*
 * Given two sorted arrays arr1 and arr2 and an element k. 
 * The task is to find the element that would be at the kth position of 
 * the combined sorted array.

    Examples :

    Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
    Output: 6
    Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. 
    The 5th element of this array is 6.
 */



import java.util.ArrayList;

public class Kth_Element_Two_Arrays {
    public static void main(String[] args) {
        int[] array1 = {12, 3, 6, 7, 9}; 
        int[] array2 = {1, 4, 8, 10};

        System.out.println(kthElement(5, array1, array2));
    }

    public static long kthElement(int k, int arr1[], int arr2[]) {
        int i = 0; // Initialize index for arr1
        int j = 0; // Initialize index for arr2
        int n = arr1.length; // Length of arr1
        int m = arr2.length; // Length of arr2
    
        ArrayList<Integer> arr = new ArrayList<>(); // Temporary list to store merged elements
        
        // Merge elements from both arrays into arr in sorted order
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr.add(arr1[i]); // Add element from arr1 to arr
                i++; // Move to next element in arr1
            } else {
                arr.add(arr2[j]); // Add element from arr2 to arr
                j++; // Move to next element in arr2
            }
        }
    
        // If there are remaining elements in arr1, add them to arr
        while (i < n) {
            arr.add(arr1[i]);
            i++;
        }
    
        // If there are remaining elements in arr2, add them to arr
        while (j < m) {
            arr.add(arr2[j]);
            j++;
        }
    
        // Return the k-th element in the merged array
        return arr.get(k - 1);
    }
}


 /*
    Time Complexity:
    - The while loops to merge the arrays each iterate over the length of the arrays. Since the total number of elements is n + m (length of arr1 + length of arr2), the merging process takes O(n + m) time.
    - Accessing the k-th element from the merged array is O(1) as it's a simple get operation on an ArrayList.
    
    Overall time complexity: O(n + m)
    
    Space Complexity:
    - We use an ArrayList to store the merged elements. In the worst case, this list will have n + m elements.
    - Hence, the space complexity is O(n + m).
    
    Overall space complexity: O(n + m)
    */