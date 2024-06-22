/* Leetcode..

 * Given two integer arrays nums1 and nums2, 
 * return an array of their intersection. 
 * Each element in the result must appear as many times as it 
 * shows in both arrays and you may return the result in any order.

    Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]

 */


package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Inter_Section_Array_II {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {5,3,4,8}; 

        System.out.println(Arrays.toString(intersect(array1, array2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both the arrays first...
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Create an array list...
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // Use two pointers i and j for the two arrays and initialize both with zero.
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // If nums1[i] is less than nums2[j]...
            // Leave the smaller element and go to next(greater) element in nums1...
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // If nums1[i] is greater than nums2[j]...
            // Go to next(greater) element in nums2 array...
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected...
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Create a output list to store the output...
        int[] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }
}

/*

 * Time Complexity:: 𝑂(𝑛log𝑛 + 𝑚log𝑚)
 * Space Complexity:: O(min(n,m))

 */
