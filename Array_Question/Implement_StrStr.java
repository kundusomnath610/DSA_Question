public class Implement_StrStr {
    public static void main(String[] args) 
    {
        String str1 = "MiraRoyPara";
        System.out.println(strstr(str1, "Roy"));
    }

    public static int strstr(String str, String x)
    {
       // Your code here
       for(int i=0; i <= str.length() - x.length(); i++) { // it is check to 
        if (str.substring(i, i + x.length()).equals(x)) {
            return i;
        }
       }
       return -1;
    }
}
