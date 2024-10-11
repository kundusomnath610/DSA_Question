import java.util.Arrays;

public class Recognize_the_array {
    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        rearrange(array);
        System.out.println(Arrays.toString(array));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] != -1 && arr[i] != i) {
                // Swap arr[i] with arr[arr[i]]
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
    }
}

