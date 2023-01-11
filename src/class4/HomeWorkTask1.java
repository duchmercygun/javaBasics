package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a diploma?");
        boolean diploma = scan.nextBoolean();
        double gpa = scan.nextDouble();

        if (diploma) {
            System.out.println("Congratulations!!"); ;
            }else {
            System.out.println("Get a degree");
        }

    }
}