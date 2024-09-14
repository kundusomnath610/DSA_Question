public class RemoveString {
    public static void main(String[] args) {
        String str = "somnath";
        char c = 's';
        remove(str, c);
    }

    public static void remove(String str, char c) {
        int n = str.length();
        String s = "";
        for(int i=0; i<n; i++) {
            if(str.charAt(i) != c) {
                s = s + str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
