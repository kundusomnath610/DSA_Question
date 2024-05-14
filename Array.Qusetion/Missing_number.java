public class Missing_number {
    public static void main(String[] args) {
        int [] arr = {1,2,4}; // only one missing number possible in the array...
        System.out.println(missing_number(arr, 4)); 
    }
    public static int missing_number(int[]arr, int n) {
        
        //// Natural number Formula to find the natural Number.
        int naturalNumber = (n*(n+1))/2;  // 4*(4+1)/2 = 20/2 = 10 is(Natural Number)
        int sum = 0;

        for(int i=0; i < arr.length; i++) { // Traverse the array .....

            // Adding the sum number one by one in the array...
            sum+= arr[i]; // 1+2+4 = 7
        }
        // return the subtract value of naturalNumber - sum...
        return naturalNumber - sum; // 10 - 7 = 3 (3 is the missing number)...
    }
}


/*
 * Space complexity is O(1)
 * Time Complexity is O(N)
 */
