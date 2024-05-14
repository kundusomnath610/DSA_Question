public class Max_Element_of_first_and_Min_Second {
    public static void main(String[] args) {
        int [] arr = {1,4,6,2,7};
        int[] arr1 = {1 ,2, 6, 3,9};

        System.out.println(find_multiplication(arr, arr1, 5, 5));
    }
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        long max = arr[0];
        long min = brr[0];
        
        for(int i=0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        for(int j = 0; j < m; j++) {
            if(brr[j] < min) {
                min = brr[j];
            }
        }
        return max * min;
    }
}
