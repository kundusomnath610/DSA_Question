import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Find_missing_in_second_array {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,10};
        int [] array1 = {2,3,1,0,5};
        
        System.out.println(findMissing(array, array1, 6, 5));
    }

    public static ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
        // A Set called set is instantiated using HashSet. 
        //This will be used to store the elements of array b for quick lookup.
        Set <Integer> set = new HashSet<>();
        // An ArrayList called al is instantiated. 
        // This will store the elements that are present in a but not in b.
        ArrayList<Integer> al = new ArrayList<>();

        // This loop iterates over each element x in array b and adds it to the set.
        for(int x : b) {
            set.add(x);
        }

        // For each element x in a, it checks if set does not contain x (i.e., x is not in b).

        for(int x : a) {
            if(! set.contains(x)) {
                al.add(x);
            }
        }
        return al; // return the ArrayList Contains Element..
    }
}
