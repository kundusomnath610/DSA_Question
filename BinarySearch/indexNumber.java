package BinarySearch;

public class indexNumber {
    public static void main(String[] args) {
       int [] array = {1,2,3,4,8};
       System.out.println(findIndex(array, 5, 8)); 
    }

    public static int findIndex(int arr[], int n, int k) { 
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = high + (low - high) / 2;

            if(arr[mid] == k) {
                return mid;
            }
            else if(arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
        
    }
}


// this a efficiant solu to find an index number rathe than linear search...
// Time Complexity is :: O(logn)
// Space Comeplexity :: O(1).. here in this case
///////////////////////////////////////////////////////////////////////////////

/*

    This is the linear search approch for finding an array element index..
    with time complexity O(n)and space is O(1)
    
 * //  public static int findIndex(int arr[], int n, int k) { 
//     for(int i=0; i < n; i++) {
//         if(arr[i] == k) {
//             return i;
//         }
//     }
//     return -1;
// }
 */



