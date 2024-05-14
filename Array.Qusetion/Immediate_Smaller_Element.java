public class Immediate_Smaller_Element {
    public static void main(String[] args) {
        int[] arr1 = {4,2,1,5,3};
        immediateSmaller(arr1, 5);
        for(int num : arr1 ) {
            System.out.print(num + " ");
        }
    }
    public static void immediateSmaller(int arr[],int n) {
        for(int i=0; i < n-1; i++) { // the loop is iterate till the last element of the array.
            if(arr[i] > arr[i+1])  // compear current index value and right index value 
                arr[i] = arr[i+1]; // After compearing i index value pre-incement and update the current index value.... 
            else 
                arr[i] = -1; // And else part if the current index value is smaller then right index value then it -1.... 
        }
        arr[n-1] = -1; // for the last element there are no element in the right to compear itself, So it return -1....
    }
}

