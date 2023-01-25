package class12;

public class StringDemoIndividualCharacters {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c);

        //write a loop that will count all the individual characters present on the string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
