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
