public class count_the_zero {
    public static void main(String[] args) {
        int [] array = {1,1,1,1,0,0,0,0};
        System.out.println(countZeroes(array, 8));
    }

    public static int countZeroes(int[] arr, int n) {
        int count = 0;

        for(int i=0; i < n; i++) { // Traverse the loop
            if(arr[i] == 0) { // check the condition if current element is equal to the zero..
                
                // If the condition arr[i] == 0 is true, it increments the count variable by 1. 
                //This means a zero was found and the count of zeroes is increased by one.
                count = count + 1;
            }
        }
        return count; // then return the count..
    }
}
