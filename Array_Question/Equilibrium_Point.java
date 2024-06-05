public class Equilibrium_Point {
    public static void main(String[] args) {
        long [] array = {3,1,5,2,2}; // calculating 1 Based index..
        System.out.println(equilibriumPoint(array, 5)); // print the statement ..
    }

    public static int equilibriumPoint(long arr[], int n) {
        // Initialize sum to store the total sum of the array elements
        long sum = 0; 
        // Initialize rightSum to store the sum of elements on the right of the current index
        long rightSum = 0;
    
        // Calculate the total sum of the array
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
    
        // Iterate through the array to find the equilibrium point
        for(int i = 0; i < n; i++) {
        // Subtract the current element from sum to get the sum of elements to the right of the current index
        sum -= arr[i];
        
        // Check if the rightSum (sum of elements to the left) is equal to the updated sum (right side sum)
        if(sum == rightSum) {
            // If they are equal, return the 1-based index of the equilibrium point
            return i + 1;
        } else {
            // If not, add the current element to rightSum to update the left side sum for the next iteration
            rightSum += arr[i];
        }
    }
    
    // If no equilibrium point is found, return -1
    return -1;
    }
}
