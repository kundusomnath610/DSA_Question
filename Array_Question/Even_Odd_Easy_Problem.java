import java.util.Arrays;

public class Even_Odd_Easy_Problem {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 12, 1, 5, 8};
        reArrange(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
        reArrange(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void reArrange(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;

        while (i < n && j < n) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                // Swap arr[i] and arr[j] if arr[i] is odd and arr[j] is even
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            // Move i and j to the next odd and even indices respectively
            i += 2;
            j += 2;

            // Skip odd indices until an odd number is found
            while (i < n && arr[i] % 2 == 0) {
                i += 2;
            }

            // Skip even indices until an even number is found
            while (j < n && arr[j] % 2 != 0) {
                j += 2;
            }
        }
    }
}
