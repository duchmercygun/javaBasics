package class05;

import java.util.Scanner;

public class HomeWorkJan7T6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("Enter three numbers");

        int number1=scan.nextInt();
        int number2= scan.nextInt();
        int number3= scan.nextInt();

        if (number1>number2 || number1>number3){
            System.out.println("The largest number is number1");
            if (number2>number1 || number2>number3){
                System.out.println("The largest number is number2");
            }else {
                    System.out.println("The largest number is number3");
                }

        }
    }
}
