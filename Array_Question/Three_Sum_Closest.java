import java.util.Arrays;

public class Three_Sum_Closest {
    public static void main(String[] args) {
        int[] sum = {-1, 3, 4, 5};
        System.out.println(threeSumClosest(sum, 2)); // Call the threeSumClosest method and print the result
    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length; // Get the length of the array
        int closestSum = 100000; // Initialize closestSum with a large value

        Arrays.sort(nums); // Sort the array

        // Iterate through the array, considering each element as a potential part of the triplet
        for (int k = 0; k <= n - 3; k++) {
            int i = k + 1; // Initialize i to the element right after k
            int j = n - 1; // Initialize j to the last element

            // Use two pointers to find the closest sum
            while (i < j) { // Corrected the condition here
                int sum = nums[i] + nums[k] + nums[j]; // Calculate the sum of the triplet

                // Update closestSum if the current sum is closer to the target
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                // Move the pointers based on the comparison of sum and target
                if (sum < target) {
                    i++; // Increment i if sum is less than target
                } else {
                    j--; // Decrement j if sum is greater than target (corrected from j++ to j--)
                }
            }
        }

        return closestSum; // Return the closest sum found
    }
}
