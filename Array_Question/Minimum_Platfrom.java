import java.util.Arrays;

public class Minimum_Platfrom {
    public static void main(String[] args) {
        int [] array1 = {900, 940, 950, 1100, 1500, 1800};
        int [] array2 = {910, 120, 1120, 1130, 1900, 2000};

        System.out.println(findPlatform(array1, array2, 6));
    }
    public static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0;
        int j=0;
        int count = 0;
        int max_count = 0;

        while(i < n) {
            if(arr[i] <= dep[j]) {
                count++;
                i = i+1;
            } else {
                count = count - 1;
                j = j+1;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
}


/*
 * Time Complexity:-- For sorting == N(Logn) + N(Logn)
 * for while loop it is two array == O(2n)
 *                        OverAll == 2(NLogn + N)
 * 
 * Space Complexity is = O(1) Constant space..                  
 */