import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_Of_Two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,};

        System.out.println(doUnion(arr1, 5, arr2, 3));
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        //write your code

        Arrays.sort(a);
        Arrays.sort(b);

        //Create a Set to avoid the duplicate value....
        Set<Integer> set = new HashSet<>();

        //Travrasing Loop for Array a....
        for(int i=0; i < a.length; i++) {
            set.add(a[i]); // After Traversing Add the value in the set.....
        }

        // Traversing Loop for the Array b.....
        for(int j=0; j < b.length; j++) {
            set.add(b[j]); // And after traversing add the value in the set.....
        }

        return set.size(); // And Finily return the set Size.....
    }
} 
