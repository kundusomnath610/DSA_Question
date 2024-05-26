public class count_pair_sum {
    public static void main(String[] args) {  
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {2,3,5,8};
        
        System.out.println(countPairs(arr1, arr2, 4, 4, 10));
    }

    static int countPairs(int arr1[],int arr2[], int M, int N, int x) {
        int i = 0;  // Initialize pointer i to the start of arr1
        int j = N - 1;  // Initialize pointer j to the end of arr2
        int c = 0;  // Initialize the counter for pairs
    
        while (i < M && j >= 0) {  // Continue the loop while i is within bounds of arr1 and j is within bounds of arr2
        if (arr1[i] + arr2[j] == x) {  // Check if the sum of the current elements equals x
            i++;  // Move the pointer i to the right
            j--;  // Move the pointer j to the left
            c++;  // Increment the counter as a valid pair is found
        } else if (arr1[i] + arr2[j] < x) {  // If the sum is less than x
            i++;  // Move the pointer i to the right to increase the sum
        } else {  // If the sum is greater than x
            j--;  // Move the pointer j to the left to decrease the sum
          }
        }
        return c;  // Return the total count of pairs
    }   

}

/*
 *  Time Complexity :: O(M+N)
 *  Space Complexity:: O(1)
 */