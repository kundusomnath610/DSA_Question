public class Good_substring {
    public static void main(String[] args) {
        String str = "8855";
        System.out.println(cntGood(str));
    }

    public static long cntGood(String S) {
        // code here
        int n = S.length();
        int w = 0;
        long count = 0;
        
        for(int i=0; i<n; i++) {
            int a = S.charAt(i) - '0';
            
            if(a %2 != 0) {
               count += i+1;
               count -= w; 
            }
            
            if(a == 0) {
                w++;
            }
        }
        return count;
    }
}
