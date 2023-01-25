package class12;

public class StringDemoBeginIndex {
    public static void main(String[] args) {
        String str="Send it to support channel. More Java";

        // returns the new String from this index
        String newStr=str.substring(28);
        System.out.println(newStr);
        // we can specify the starting point and the ending point
        System.out.println(str.substring(0,27));
    }
}
