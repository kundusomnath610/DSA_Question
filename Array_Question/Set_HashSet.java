import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Somnamth");
        names.add("kundu");
        names.add("ram");
        names.add("shyam");
        names.remove("ram");
        


        System.out.println(names);
    }
}