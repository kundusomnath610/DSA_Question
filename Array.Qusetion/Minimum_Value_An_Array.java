public class Minimum_Value_An_Array {
    public static void main(String[] args) {
        int [] arr = {8,4,6,7,3,2};
        System.out.println(find_min(arr, 4));
    }

    public static int find_min(int[]arr, int n) {
        int min = arr[0];

        for(int i=1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
