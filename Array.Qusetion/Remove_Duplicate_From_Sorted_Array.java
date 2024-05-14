public class Remove_Duplicate_From_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,4}; // initialize the input Array
        System.out.println(remove_duplicate(arr, 6)); // print the array with size..
    }
    // this a static function with args A[] and Size of Array N..
    public static int remove_duplicate(int A[],int n) { 
        int i=0; // i pointer start from 0th index position..

        // start the for loop from jth position 1st index..
        for(int j=1; j < n; j++) { 
            if(A[i] != A[j])  // Check if i pointer and j pointer is not matched then found Unique..
                i++; // increment the ith index..
                A[i] = A[j]; // then store the unique element array ith position..
            
        }
        return i+1; // return the new ith position... 
    }
}

/*
 * The time complexity of this code is O(n), 
 * where n is the size of the input array. 
 * This is because the algorithm iterates through the array only once with a single loop, 
 * comparing adjacent elements to remove duplicates. 

 * The space complexity is O(1), 
 * which means it uses constant extra space. 
 * This is because the algorithm modifies 
 * the input array in-place without using any additional data structures 
 * that grow with the size of the input.

 * Overall, this algorithm provides an efficient way to remove duplicates from a sorted array
 *  with linear time complexity and constant space complexity.
 * 
 */