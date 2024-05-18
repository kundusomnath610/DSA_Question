import java.util.Arrays;

public class count_reapeted_Number {
    public static void main(String[] args) {
        int [] arr = {8,8,3,1,5,4,9};
        System.out.println(reapeteNum(arr, 8 ));
    }

    public static int reapeteNum(int arr[], int target) {
        Arrays.sort(arr); // sort the Array..
        int count = 0; // initilize the count with 0..

        for(int i=0; i < arr.length; i++) { // traverse the array..
            if(arr[i] == target) // if array current element is equal to target
                count+= 1; // then initilize the update the count and store the count number...
        }
        return count; // atleast return the count number ...which is repeted..
    }
}

/*
 * Time Complexity:: O(n)
 * Space Complexity:: O(1).
 */
