public class Search_Element_index {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,8,9};
        System.out.println(search(arr, 6, 2));
    }

    private static int search (int [] arr, int n, int x) {
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == x) { // this is the value of compearing index number to the given input...
                return i; // here we return the index number if present ....
            }
        }
        return -1; /// If number is not preent then return -1....
    }
}


/*
   Search the element of an array index.
    arr[] input is {1,2,3,4};
       indexNumber: 0 1 2 3
    TASK:- Return the index number in the present element an array
           if the number not prestnt in array the simpley return -1;
 */
