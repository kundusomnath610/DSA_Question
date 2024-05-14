public class Balanced_Array {
    public static void main(String[] args) {
        long [] arr = {1, 5, 3, 2};
        System.out.println(minValueToBalance(arr, 4));
    }
    public static long minValueToBalance(long a[] ,int n)
    {
        long temp = 0;  // Initialize a variable to hold the sum of the first half of the array
        long ans = 0;   // Initialize a variable to hold the answer
        
        // Loop through the first half of the array
        for(int i=0; i < n/2; i++) {
            temp = temp +  a[i];  // Add each element to the sum
        }
        
        long sum = 0;  // Initialize a variable to hold the sum of the second half of the array
        
        // Loop through the second half of the array
        for(int j = n/2; j < n; j++) {
            sum = sum + a[j];  // Add each element to the sum
        }
        
        // Check which sum is greater and calculate the difference
        if(temp > sum) 
            ans = temp - sum;  // If the sum of the first half is greater, subtract the sum of the second half from it
        else 
            ans = sum - temp;  // If the sum of the second half is greater, subtract the sum of the first half from it
        
        return ans;  // Return the minimum value needed to balance the array
    }
}
