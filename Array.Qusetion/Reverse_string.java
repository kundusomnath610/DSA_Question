public class Reverse_string {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {
        String str1 = " ";

        for(int i = str.length() - 1; i >=0; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }
}
