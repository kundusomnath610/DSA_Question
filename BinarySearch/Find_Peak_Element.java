package BinarySearch;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int [] array = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(array));
    }

    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
        // Calculate mid point to split the array
        int mid = low + (high - low) / 2;

        // Ensure mid is within valid index range
        if (mid > 0 && mid < nums.length - 1) {
            // Check if the mid element is greater than its neighbors
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // If the left neighbor is greater, move the high pointer to mid - 1
            else if (nums[mid - 1] > nums[mid]) {
                high = mid - 1;
            } 
            // If the right neighbor is greater, move the low pointer to mid + 1
            else {
                low = mid + 1;
            }
        } 
        // Special case: if mid is at the start of the array
        else if (mid == 0) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                low = 1;
            }
        } 
        // Special case: if mid is at the end of the array
        else if (mid == nums.length - 1) {
            if (nums[nums.length - 1] > nums[nums.length - 2]) {
                return nums.length - 1;
            } else {
                high = nums.length - 2;
            }
        }
    }
        // When low and high converge, low will be the peak element
        return low;
    }
}
