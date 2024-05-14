public class Binary_Search {
    public static void main(String[] args) {
        int[] ints = {1,2,3,5,7,9,11};

        System.out.println(binarySearch(ints, 8));
    }
    
    private static int binarySearch(int [] numbers, int numberToFind ) {
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2; 

            int MiddleNumber = numbers[mid];

            if(numberToFind == MiddleNumber) {
                return mid;
            }
            if(numberToFind < MiddleNumber) {
                high =  mid - 1;
            }
            else {
                low =  mid + 1;
            }
        }

        return - 1;

    }

}

