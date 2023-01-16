package Class08HomeWork;

public class Task6 {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {

            if (i == 1 || i == 3) {
                System.out.println();
            } else if (i % 2 == 0) {
                System.out.println("*");
            } else {
                System.out.println("**");
            }
        }
    }
}
