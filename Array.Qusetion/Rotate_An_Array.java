public class Rotate_An_Array {
    public static void main(String[] args) 
    {
        int [] arr1 = {1,2,3,4,5,6}; // it is the array for input..
        leftRotate(arr1, 6, 2); // here the Static from the static function method call and put the input of array size and where the index number where the array rotate start....
        /*
        
        //This is the traditional way(for loop) to print the array...

        for(int i=0; i < arr1.length; i++) {
            int num = arr1[i];
            System.out.print(num + " ");
        }
        */ 
         
        // this is the enhanched for each loop for print the array...
        for(int num : arr1) {
            System.out.print(num + " ");
        }
    }

    public static void leftRotate(int[] arr, int n, int d) 
    {    // arr{1,2,3,4,5} d=2 .. the new arr[] willbe {3,4,5,1,2}...
        int k = 0;
        int [] temp = new int[n]; // Creating a new array for store the array..
        
        for(int i = d; i < n; i++) { // Here the loop begin from dth index till the arr length...
            temp[k] = arr[i]; // Here store array index in temp variable...
            k++; // increment the k...
        }

        for(int i=0; i < d; i++) { // Here the loop begin from 0th index and continue till d position....
            temp[k] = arr[i]; // again store array index in temp variable....
            k++; // k increment...
        }

        for(int i=0; i < n; i++) { // here traverse the new new array/or copy array....
            arr[i] = temp[i]; // store the old temp array in the new array...and it is the reverse the new array.....
        }
    }

}
