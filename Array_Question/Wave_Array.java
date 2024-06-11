/*
 * Question :: 
 * 
 *  Given a sorted array arr[] of distinct integers. 
 *  Sort the array into a wave-like array(In Place).
    In other words, arrange the elements into a sequence 
    such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

    If there are multiple solutions, find the lexicographically smallest one.

    Note:The given array is sorted in ascending order, 
    and you don't need to return anything to make changes 
    in the original array itself.
 */



public class Wave_Array {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        convertToWave(5, array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void convertToWave(int n, int[] arr) {
        for(int i=0; i < n - 1; i= i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}

/*
 * Time Complexity :: O(n)
 * Space Complexity :: O(n)
 */
