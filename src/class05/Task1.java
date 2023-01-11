package class05;

public class Task1 {
    public static void main(String[] args) {

        /*
        Write a program to find the largest among three distinct numbers using nested if condition using scanner class
        to take input
         */

        int number1=1000, number2=200, number3=3000;

        if (number1>number2) {
            if(number1>number3){
                System.out.println("Number is the largest " +number1);
            }
        }

        if (number2>number1){
            if (number2>number3) {
                System.out.println("Number 2 is the largest " +number2);
            }
        }

        if (number3>number1){
            if (number3>number2) {
                System.out.println("Number 3 is the largest " +number3);
            }
        }
    }
}
