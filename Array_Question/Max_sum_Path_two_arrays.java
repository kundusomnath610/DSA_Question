public class Max_sum_Path_two_arrays {
    public static void main(String[] args) {
        int arrOne[] = {2, 3, 7, 10, 12};
        int arrTwo[] = {1, 5, 7, 8};

        System.out.println(maxPathSum(arrOne, arrTwo));
    }

    public static int maxPathSum(int[] arr1, int[] arr2) { // Changed List<Integer> to int[]
        int m = arr1.length;
        int n = arr2.length;
        int s1 = 0, s2 = 0;
        int ans = 0;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) { // Check for equality using ==
                ans += Math.max(s1, s2) + arr1[i];
                i++;
                j++;
                s1 = 0;
                s2 = 0;
            } else if (arr1[i] < arr2[j]) {
                s1 += arr1[i++]; // Add arr1[i] to s1
            } else {
                s2 += arr2[j++]; // Add arr2[j] to s2
            }
        }

        while (i < m) {
            s1 += arr1[i++];
        }

        while (j < n) {
            s2 += arr2[j++];
        }

        ans += Math.max(s1, s2);
        return ans;
    }
}
