/*
 * Question :: 
    *  Given a sorted array containing only 0s and 1s, 
        * find the transition point, i.e., 
        * the first index where 1 was observed, and before that, 
        * only 0 was observed.
 */


public class Find_Tranction_Point {
    public static void main(String[] args) {
        int [] array = {0,0,0,0,1,1,1};
        System.out.println(transitionPoint(array, 7));
    }

    public static int transitionPoint(int arr[], int n) {
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2; // 0 + 1 / 2 = 0

            if(arr[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            // if(low == 0) {
            //     return -1;
            // }
        }
        return low;
    }
}


/*
 * Time complexity:: O(Log(N)) Because the binary search
 * Space Complexity is :: O(1)..
 */