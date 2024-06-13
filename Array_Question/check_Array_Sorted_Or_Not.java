public class check_Array_Sorted_Or_Not {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(arraySortedOrNot(array, 5));
    }
        public static boolean arraySortedOrNot(int[] arr, int n) {
            for(int i=1; i < n; i++) {
                if(arr[i] < arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }
