/*
 * Question :: 
 *  Given a sorted array A[] having 10 elements which 
 *  contain 6 different numbers in which only 1 number is repeated five times.
 *  Your task is to find the duplicate number using two comparisons only.
 * 
 * Example 1::
 *  Input: 
    A[] = {3, 3, 3, 3, 44, 55, 22}
    Output: 1
 * 
 */

public class Find_duplicate_under_given_Constrain {
    public static void main(String[] args) {
        int [] array = {3,3,3,3,44,55,22};
        System.out.println(findDuplicate(array));
    }

    public static int findDuplicate(int arr[]) {
        int m = 0;
        for(int i=0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) 
                m = arr[i];
        }
        return m;
    }
}

/*
 * Time Complexity :: O(n)
 * Space Complexity :: O(1)
 */
