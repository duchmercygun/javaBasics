package Class08HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Apply for a credit card");
            String userInput=scan.nextLine();

            if (userInput.equalsIgnoreCase("YES")) {
                break;
            }
        }
    }
}
