package BinarySearch;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int [] array = {3,4,5,1,2};

        System.out.println(findMin(array));
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if(nums[mid] < nums[high]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
