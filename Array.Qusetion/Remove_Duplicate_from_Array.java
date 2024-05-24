import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_from_Array {
    public static void main(String[] args) {
        int [] array = {1,2,2,3,4};
        System.out.print(removeDuplicate(array, 5));
    }
    
    public static int[] removeDuplicate(int A[], int N)
    {
        Set<Integer> set = new LinkedHashSet<>();// use linked hashset for maintain the order size..
        
        for(int i=0; i < N; i++) { // traverse the loop all element 
            set.add(A[i]); // store the current element in the set... 
        }
        
        int i=0; // initilize the i ..
        int [] temp = new int[set.size()]; // create a temp array with the size of equal to set size.. 
        for(int element : set) { // for each loop track the element..
            temp[i++] = element; // update and increment temp with element..
        }
        return temp; // finaily return the modify updated temp array..
    }
}

