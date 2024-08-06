import java.util.Arrays;

public class Minimum_Number_of_Pushes_to_Type_Word_two {
    public static void main(String[] args) {
        String str = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(str));
    }

    public static int minimumPushes(String word) {
        int[] array = new int[26]; // Initialize an array to store the frequency of each letter in the word.
        for (char ch : word.toCharArray()) { // Iterate over each character in the word.
        array[ch - 'a']++; // Increment the frequency of the corresponding letter.
    }

        Arrays.sort(array); // Sort the frequency array in ascending order.
        int count = 0; // Initialize a counter to keep track of the number of letters processed.
        int minPress = 0; // Initialize a variable to store the minimum key presses required.

    // Reverse loop through the sorted frequency array.
    for (int i = 25; i >= 0; i--) {
        // Calculate the key presses required for the current letter.
        // The multiplier (count / 8 + 1) increases every 8 letters to simulate pressing more keys.
        int val = array[i] * (count / 8 + 1);
    
        minPress += val; // Add the calculated value to the total minimum key presses.
        count++; // Increment the counter.
    }
    return minPress; // Return the total minimum key presses.
    }
}


/*
 * Time Complexity :: O(n)
 * Space Complexity :: O(1) 
 */