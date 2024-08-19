import java.util.TreeMap;

public class Kth_Smallest {
    public static void main(String[] args) {
        int [] array = {1,5,3,4,9};
        System.out.println(kthSmallest(array, 4));
    }
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        
        //Build the treeMap
        for(int i=0; i < arr.length; i++) {
            tree.put(arr[i], tree.getOrDefault(arr[i],0) + 1);
        }
        
        // Itrate the treeMap for build tree
        for(int num : tree.keySet()) {
            k -= tree.get(num); // subtract the kth element from treeMap
            
            if(k == 0) { // if k is equal to zero
                return num; // return the num
            }
        }
        return -1; // if array out of bound the print -1.
    }
}
