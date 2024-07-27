import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String st = "zovo";
        System.out.println(removeDups(st));
    }
    public static String removeDups(String str) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(int i=0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        String str1 = " ";
        for(char ch : hs) {
            str1 += ch;
        }
        return str1;
    }
}

/*
 * Time complexity:- O(n)
 * Space Complexity:- O(1)
 */
