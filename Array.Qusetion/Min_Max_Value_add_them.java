public class Min_Max_Value_add_them {
    public static void main(String[] args) {
        int [] arr1 = {2,3,5,6,10};
        System.out.println(findSum(arr1, 5));
    }
    public static int findSum(int A[],int N) {
        int sum = 0; // Variable to store the sum of the maximum and minimum values
        int min = A[0]; // Variable to store the minimum value, initialized with the first element of array A
        int max = A[0]; // Variable to store the maximum value, initialized with the first element of array A

        // Loop through each element of the array A
        for(int i=0; i < N; i++) {
        // Check if the current element is greater than the current maximum value
        if(max < A[i]){
        max = A[i]; // If yes, update the maximum value
    }
    
        // Check if the current element is smaller than the current minimum value
        if(min > A[i]) {
        min = A[i]; // If yes, update the minimum value
    }
}

        sum = max + min; // Calculate the sum of maximum and minimum values
        return sum; // Return the sum

    }
}
