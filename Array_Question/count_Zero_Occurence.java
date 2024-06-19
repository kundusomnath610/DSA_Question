import java.util.HashMap;
import java.util.Map;

public class count_Zero_Occurence {
    public static void main(String[] args) {
        int [] array = {3,1,2,2,1,2,3,3};
        System.out.println(countOccurence(array, 8, 4));
    }

    public static int countOccurence(int[] arr, int n, int k) {
        int barrier = n/k; // define the barrier..
        int count = 0;

        // Creating HashMap..
        Map <Integer, Integer> map = new HashMap<>();

        // traverse the loop.. for add the value in HashMap
        for(int i=0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > barrier ) {
                count++;
            }
        }
        return count;
    }
}

