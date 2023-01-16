package class09;

public class ArrayDemo3 {
    public static void main(String[] args) {

        char [] letter={'A', 'B', 'c', 'd', 'e', 'F'};
        letter[0]='z';// how to update a variable
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);
        }
    }
}
