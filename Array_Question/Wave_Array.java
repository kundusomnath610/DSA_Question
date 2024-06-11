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
