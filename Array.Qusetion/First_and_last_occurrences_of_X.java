import java.util.ArrayList;
public class First_and_last_occurrences_of_X {
    public static void main(String[] args) {
        int [] arr = {1,3,3,4};
        System.out.println(firstAndLast(arr, 4, 3));
    }
    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(arr[i] == x) {
                list.add(i);
                
            }
        }
        if(list.size()==0) {
            list.add(-1);
          return  list;
        }
        list1.add(list.get(0));
        list1.add(list.get(list.size()-1));
        
        return list1;
    }
}
