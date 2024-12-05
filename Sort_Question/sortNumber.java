package Sort_Question;

public class sortNumber {
    public static void main(String[] args) {
        int [] array = {0,1,0,2,1,0,2};
        sort012(array);

        for(int x : array) {
            System.out.print(x); // 0001222..
        }
    }   
    
    public static void sort012(int[] arr) {
        int zero = 0, one = 0;
        int n = arr.length;

        for(int i=0; i < n; i++) {
            if(arr[i] == 0) {
                zero++;
            } else if(arr[i] == 1) {
                one++;
            }
        }

        // Reorder the array with respect 0, 1, 
        for(int i=0; i < n; i++) {
            if(zero > 0) {
                arr[i] = 0;
                zero--;
            } else if(one > 1) {
                arr[i] = 1;
                one--;
            } 
            else {
                arr[i] = 2;
            }
        }
    }
}


// Time com :- O(n)
// Space com:- O(1)

