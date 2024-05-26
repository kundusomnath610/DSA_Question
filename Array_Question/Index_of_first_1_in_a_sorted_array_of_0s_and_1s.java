/*
 * Qustion::
 *  Find the index number where 1 is present..
 *  if the array dosen't present 1 then return -1..
 */

public class Index_of_first_1_in_a_sorted_array_of_0s_and_1s {
    public static void main(String[] args) {
        long [] arr = {0,0,0,0,1};
        System.out.println(firstIndex(arr, 5));
    }
    public static long firstIndex(long arr[], long n) {
        for(int i=0; i < n; i++) {
            if(arr[i] == 1) 
                return i;
        }
        return -1;
    }
}
/*
 * Time Complexity:: - O(n)
 * Space Complexity;; - O(1)..
 */