import java.util.Arrays;
public class The_problem_of_identical_array {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int [] array1 = {3, 4, 1, 2, 5};

        System.out.println(check(array, array1, 5));
    }

    public static int check (int arr[], int[] brr, int n) {
        Arrays.sort(arr); // sort the array
        Arrays.sort(brr); // sort the second array
        
        for(int i=0; i < n; i++) { // traverse the array..
            if(arr[i] != brr[i]) // if condition is first array element and second array element is not equal
                return 0; // return 0..
        }
        return 1; // otherwise return 1..
    }
}
