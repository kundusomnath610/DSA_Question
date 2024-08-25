public class Good_substring {
    public static void main(String[] args) {
        String str = "8855";
        System.out.println(cntGood(str));
    }

    public static long cntGood(String S) {
        // code here
        int n = S.length();
        int counter = 0;
        long count = 0;
        
        for(int i=0; i<n; i++) {
            int a = S.charAt(i) - '0';
            
            if(a %2 != 0) { // Cheak the number is odd
               count += i+1; // if odd the current index plus one
               count -= counter; // counter is zero then it not move..
            }
            
            if(a == 0) { // if current element is zero then counter move forword.
                counter++;
            }
        }
        return count;
    }
}
