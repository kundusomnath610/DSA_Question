/*
 *  Question ::
 *  Provided an array Arr of N integers, you need to reverse a subarray of that array. 
 *  The range of this subarray is given by indices L and R.
 * 
 * Example ::
 *  Array = 1,2,3,4,5,6,7
 *  reverseSub Array = 1,2,6,5,4,3,7
 * 
 *  Because the left starting element and end starting element is 3 to 7 
 *  modify array is = 1,2,6,5,4,3,7.. 
 * 
 */

public class Reverse_sub_Array {
    public static void main(String[] args) {
      int [] array = {1,2,3,4,5,6,7};
      reverseSubArray(array, 7, 3, 6);
      
      for(int num : array) {
        System.out.print(num + " ");
      }
    }
        public static void reverseSubArray(int arr[], int n, int l, int r) {
            // code here
            
            int start = l - 1; // start index l - 1 for 0 based index..
            int end = r - 1; // start index r - 1 for 0 based index..
            
            while(start < end) { // loop is going on till start index grater than end index.
                int temp = arr[start]; // initilize the temp variable with start index.
                arr[start] = arr[end]; // swap the element ..
                arr[end] = temp; // swap with the modify  with temp...
                start++; // start increment.. untill both pointer matched..
                end--; // end decrement.. untill both pointer matched..
            }
        }
}
