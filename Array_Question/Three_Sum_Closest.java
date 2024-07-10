import java.util.Arrays;

public class Three_Sum_Closest {
    public static void main(String[] args) {
        int [] sum = {-1,3,4,5};
        System.out.println(threeSumClosest(sum, 2));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = 100000;

        Arrays.sort(nums);
        for(int k=0; k <= n - 3; k++) {
            int i = k + 1;
            int j = n - 1;

            while(i < k) {
                int sum = nums[i] + nums[k] + nums[j];
                if(Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if(sum < target) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return closestSum;
    }
}
