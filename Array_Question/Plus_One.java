import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        System.out.println(Arrays.toString(plusOne(array)));
    }
    public static int[] plusOne(int[] digits) {
        for(int i= digits.length - 1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[0] = 1;
        }
        int [] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}


////////////////////////////////////////////////////////////////////////////////////////
/*
 * This is ArrayList Approch.. in GFG ..
 * 
 * class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) 
    {
        // code here
       for (int i = N - 1; i >= 0; i--) {
            // If the current element is less than 9, increment it and return the list
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return arr;
            } else {
                // Set the current element to 0 if it's 9
                arr.set(i, 0);
            }
        }
        // If all elements were 9, we need a new list with size N + 1
        ArrayList<Integer> Arr = new ArrayList<>(N + 1);
        // Initialize the new list
        Arr.add(1); // First element should be 1
        for (int i = 1; i <= N; i++) {
            Arr.add(0); // All other elements should be 0
        }
        return Arr;
    }
};
 */
