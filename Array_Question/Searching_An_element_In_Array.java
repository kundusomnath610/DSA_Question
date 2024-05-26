public class Searching_An_element_In_Array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,6};
        System.out.println(searchInSorted(arr1, 5, 5));
    }

    static int searchInSorted(int arr[], int N, int K) {
        
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == K) 
                return 1;
        }

        return -1;
    }
}


/*
 *  Here the function check the element is present in array or not 
 *  If present then return 1 otherwise return -1 .. 
 * It compear the input K = 5; And the Array size of N = 5;
 */