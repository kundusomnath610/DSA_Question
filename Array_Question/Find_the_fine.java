/*
    Question ::
 * Given an array of penalties fine[], an array of car numbers car[], 
 * and also the date. The task is to find the total fine 
 * which will be collected on the given date. 
 * Fine is collected from odd-numbered cars on even dates and vice versa.
 * 
 * Example:: 1
 * Input:
    N = 4, date = 12
    car[] = {2375, 7682, 2325, 2352}
    fine[] = {250, 500, 350, 200}
    Output:
        600

    Explantion:
    The date is 12 (even), so we collect the
    fine from odd numbered cars. The odd
    numbered cars and the fines associated
    with them are as follows:
    2375 -> 250
    2325 -> 350
    The sum of the fines is 250+350 = 600

 */

public class Find_the_fine {
    public static void main(String[] args) {
        long [] arr = {2375, 7682, 2325, 2352};
        long[] arr1 = {250, 500, 350, 200};

        System.out.println(totalFine(4, 12, arr, arr1));
    }
    
        // Method to calculate the total fine based on the given conditions
        public static long totalFine(long n, long date, long car[], long fine[]) {
            // Variable to store the total fine
            long total_fine = 0;
            
            // Checking if the date is even
            if(date % 2 == 0) {
                // If the date is even, iterate through each car
                for(int i = 0; i < n; i++) {
                    // Check if the car number is odd
                    if(car[i] % 2 != 0) { 
                        // If the car number is odd, add its fine to the total fine
                        total_fine += fine[i];
                    }    
                }
            }
            else { // If the date is odd
                // Iterate through each car
                for(int i = 0; i < n; i++) {
                    // Check if the car number is even
                    if(car[i] % 2 == 0) {
                        // If the car number is even, add its fine to the total fine
                        total_fine += fine[i];
                    }
                }
            }
            // Return the total fine
            return total_fine;
        }
    }

/*
 *  Time Complexity Analysis:

    The method iterates through the car array once, which has 'n' elements. So, the time complexity of the loop is O(n).
    Within each loop, the operations are constant time, involving simple arithmetic comparisons and additions. 
    Therefore, the overall time complexity is O(n).

    Space Complexity Analysis:

    The space complexity of this method is O(1) because it only uses a fixed amount of memory regardless of the input size. 
    The additional memory used is only for the method's parameters and local variables, 
    which do not scale with the input size.
    
    Overall, the time complexity is O(n) and the space complexity is O(1).
 */