package class12;

public class StringDemoCounter {
    public static void main(String[] args) {

        String str="jdnfkfd 3498234 ^*%*";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isDigit in Str " +counter);
        
    }
}
