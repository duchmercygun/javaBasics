package class07;

import java.util.Scanner;

public class WhileDemoGuessGame {

    public static void main(String[] args) {

        boolean condition=true;
        Scanner scan=new Scanner(System.in);
        int number=15;

        while (condition) {
            System.out.println("Please enter number 10 - 20");
            int userInput=scan.nextInt();
            if (userInput>number){
                System.out.println("Your entered number is greater");
            }else if (userInput<number){
                System.out.println("You entered a smaller number");
            }else{
                System.out.println("You won!!!!");
                condition=false;
            }
        }
    }
}
