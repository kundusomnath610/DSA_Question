import java.util.ArrayList;
import java.util.List;

public class Recognize_the_array {
    public static void main(String[] args) {
        int [] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
       
    }

    public static List<Integer> rearrange(List<Integer> arr) 
    {
        // Code here
        List<Integer> list = new ArrayList<>();
        int n = arr.size();
        
        for(int i=0; i<n; i++) {
            list.add(-1);
        }
        for(int i=0; i<n; i++) {
            if(arr.get(i) != -1) {
                list.set(arr.get(i), arr.get(i));
            }
        }
        return list;
    }
}
