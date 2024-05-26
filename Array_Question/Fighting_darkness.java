/*
 *  Qusetion::
 * Given an array arr[] of size N representing the size of candles which reduce by 1 unit each day. 
 * The room is illuminated using the given N candles. 
 * Find the maximum number of days the room is without darkness.
 */

public class Fighting_darkness {
    public static void main(String[] args) {
        long [] arr = {2,3,4,2,1};
        System.out.println(maxDays(arr, 5));
    }
    public static long maxDays(long arr[], int n) {
       // code here 
        // Initialize a variable temp to store the maximum value found.
        long temp = 0;
        
        // Iterate through the elements of the array.
        for(int i=0; i < n; i++) 
        {
            // Check if the current element is greater than the current maximum value stored in temp.
            // If it is, update temp to the value of the current element.
            if(arr[i] > temp) 
                temp = arr[i];
        }
        
        // Return the maximum value found in the array.
        return temp; 
    }
}

/*
 * The time complexity of this code is O(n), 
 * where n is the number of elements in the array. 
 * This is because the code iterates through each element 
 * of the array exactly once in the for loop, 
 * making the time complexity linearly proportional to the size of the array.

    The space complexity of this code is O(1), 
    which means it requires constant space regardless 
    of the size of the input array. This is because the 
    code only uses a single additional variable (temp) to 
    store the maximum value found, and the amount of memory 
    used does not increase with the size of the input array.
 */