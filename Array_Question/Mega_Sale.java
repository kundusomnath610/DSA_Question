/*
 * Question :: 
 * Mr. Geek is a greedy seller. 
 * He has a stock of N laptops which comprises 
 * of both useful and useless laptops. 
 * Now, he wants to organize a sale to clear his stock 
 * of useless laptops. The prices of N laptops 
 * are Ai each consisting of positive and 
 * negative integers (-ve denoting useless laptops). 
 * In a day, he can sell atmost M laptops. 
 * Mr. Geek being a greedy seller want to earn 
 * maximum profit out of this sale. So, help him maximizing 
 * his profit by selling useless laptops.
 * 
 * Example ::
 *  
 * Input:
    N=4, M=3
    A[] = {-6, 0, 35, 4}
    Output:
    6
    Explanation:
    Geek sells the laptops with price -6 and
    earns Rs. 6 as profit.
 * 
 */


import java.util.Arrays;
public class Mega_Sale {
    public static void main(String[] args) {
        int [] array = {-6,0,35,4};

        System.out.println(maxProfit(array, 4, 3));
    }

    public static long maxProfit(int a[], int n, int m) {

       // Sort the array in ascending order
        Arrays.sort(a);
    
        // Initialize the variable to store the maximum profit
        long ans = 0;
    
        // If m is greater than n, adjust m to be equal to n to avoid array index out of bounds
        if(m > n) {
            m = n;
        }
    
        // Iterate through the first m elements of the sorted array
        for(int i = 0; i < m; i++) {
        // If the current element is negative, subtract it from ans
        // This is equivalent to adding its absolute value to ans
        if(a[i] < 0) {
            ans -= a[i];
        }
        // If the current element is non-negative, break out of the loop
        // Since all subsequent elements will also be non-negative due to sorting
        else {
            break;
        }
    }
    
    // Return the calculated maximum profit
    return ans;
    }
}
