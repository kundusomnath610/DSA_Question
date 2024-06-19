public class Move_all_negative_elements_to_end {
    public static void main(String[] args) {
        int [] array = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(array, 8);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void segregateElements(int arr[], int n) {

        // create a same size temp array to store the dummy element
        int [] temp = new int[n];

        //Traverse the entire array element..
        for(int i=0; i < n; i++) {
            // update the current array to temp array..further operation heppend in temp array. 
            temp[i] = arr[i]; 
        }

        int count = 0; // for tracking the element count..
        for(int i=0; i < n;  i++) { // Traverse the array for finding the positive element
            // logic to find the positive element.. if temp array current element is greater than zero then it is positive element..
            if(temp[i] >= 0) { 
                arr[count++] = temp[i]; // after finding current temp store the count variable and count increment..
            }
        }

        // finding the negative element..
        for(int i =0; i < n; i++) {
            if(temp[i] < 0 ) {
                arr[count++] = temp[i];
            }
        }

    }
}
