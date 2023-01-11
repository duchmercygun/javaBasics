package class05;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner => is name of the class
        scan => is a variable
        equal to sign (=) => assignment operator
        new = >
        System.in => tells the computer to read the data from the keyboard not from the computer
         */

        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("Your age is " +age);

        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is " +weight);

        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();

        System.out.println("Please enter your name");
        String name=scan.next(); // when we have to take only one word as input
        System.out.println("Your name is " +name);

        scan.nextLine(); // trick to make nextLine method work
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is " +fullName);

        scan.close(); // It is a good practice to close the scanner

    }
}
