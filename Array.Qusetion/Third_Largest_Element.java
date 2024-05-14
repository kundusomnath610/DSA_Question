import java.util.Arrays;

public class Third_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,-1, 7,9,-3,77,33,11,88,100,200,900,9,898,998,1000};
        System.out.println(thirdLargest(arr, 20));
    }
    public static int thirdLargest(int a[], int n) {
        if(n < 3) 
            return -1; //if the array is not grater than 3 element then it return -1...

        Arrays.sort(a); // sort the array..
        return a[n - 3]; // return the array third largest element by subtracting (size - 3)..
    }
}
