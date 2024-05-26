public class Convert_0_to_5 {
    // Main method to test the convertfive function
    public static void main(String[] args) {
        // Printing the result of convertfive function with input 1040
        System.out.println(convertfive(1040));
    }
    
    // Function to convert all occurrences of '0' to '5' in an integer and return the result
    public static int convertfive(int num) {
        // Convert the integer to a string
        String str = Integer.toString(num);
        
        // Replace all occurrences of '0' with '5' in the string
        String S = str.replaceAll("0","5");
        
        // Parse the modified string back to an integer
        int n = Integer.parseInt(S);
        
        // Return the modified integer
        return n;
    }
}

/*
 *  Time Complexity :: O(log(num)+n)
 *  Space Complexity :: O(log(num))
 */