package class12;

public class StringDemoEndsWith {

    public static void main(String[] args) {

        String str="I love JavA";
        boolean endsWith=str.endsWith("a");
        System.out.println(endsWith);
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().endsWith("a"));

    }
}
