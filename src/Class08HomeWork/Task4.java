package Class08HomeWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the item you want to buy?");
        String item = scan.nextLine();
        System.out.println("How much is the item?");
        double itemPrice = scan.nextDouble();

        while (itemPrice > 0) {
            System.out.println("How much are you going to pay?");
            double payment = scan.nextDouble();

            itemPrice = itemPrice - payment;
        }

        if (itemPrice < 0) {
            double change = itemPrice * -1; // change negative amount to positive
            System.out.println("You paid more than you owe. Your change is " + change);
        }

        System.out.println("Thank you for shopping!");
    }
}
