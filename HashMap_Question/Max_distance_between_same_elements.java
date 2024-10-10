package HashMap_Question;

import java.util.HashMap;
import java.util.Map;

public class Max_distance_between_same_elements {
    public static void main(String[] args) {
        int [] array = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(array));
    }

    public static int maxDistance(int[] arr) {
        // Initialize a HashMap to store the first occurrence of each element in the array
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Variable to store the maximum distance between two occurrences of the same element
        int max = 0;
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {  // If the current element has been seen before (exists in the map)
               
                max = Math.max(max, i - mp.get(arr[i])); // // Calculate the distance between the current index and the first occurrence of the element
                // Update the maximum distance if the new distance is larger
            } 
            // If the current element is seen for the first time, store its index in the map
            else {
                mp.put(arr[i], i);
            }
        }
        
        // Return the maximum distance found
        return max;
    }
}
