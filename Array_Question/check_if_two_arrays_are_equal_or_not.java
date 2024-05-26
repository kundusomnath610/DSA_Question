import java.util.Arrays;

public class check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int [] arr1 = {1,2,5,8};
        int [] arr2 = {2,4,15,66};


        System.out.println(check(arr1, arr2, 3));
    }

    public static boolean check (int [] A, int []B , int N) {
        
        // Both array is sorted...
        Arrays.sort(A);
        Arrays.sort(B);
        
        //Store the length of an array in a variable...
        int m = A.length;
        int n = B.length;
        
        // Check if condition the array length is Equal or not....
        // if not equal then return false otherwise true....
        if(m != n)
           return false;
          
        // iterate the loop and cheking the element of an array...
        // is not equal then return false.....
        for(int i=0; i < m; i++) {
            if(A[i] != B[i])
                return false;
        }
        
        //All the condition re not matched then return true.....
        return true;

    }
    
}
